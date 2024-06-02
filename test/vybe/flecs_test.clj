(ns vybe.flecs-test
  {:clj-kondo/ignore [:unused-value :missing-test-assertion]}
  (:require
   [clojure.test :refer [deftest testing is use-fixtures]]
   [vybe.flecs :as vf :refer [Position]]
   [vybe.flecs.c :as vf.c]
   [clojure.edn :as edn]
   [vybe.panama :as vp])
  (:import
   (java.lang.foreign Arena ValueLayout MemorySegment)))

(use-fixtures :once
  (fn [f]
    (with-open [arena (Arena/ofShared)]
      (binding [vp/*dyn-arena* arena]
        (f)))))

(defn- ->edn
  [v]
  (edn/read-string (pr-str v)))

;; Based on https://github.com/SanderMertens/flecs/blob/master/examples/c/entities/basics/src/main.c
(deftest ex-1
  ;; Create the world.
  (let [wptr (vf/-init)]
    #_ (def wptr (vf/-init))
    #_(def wptr wptr)

    ;; Create a entity called :bob and also add/create
    ;; :walking (tag) and Position (component).
    (vf/-set-c wptr :bob [:walking
                          (Position {:x 10 :y 20})])

    ;; Get position, it will return a hash map representation, you can use
    ;; normal clojure functions with it (e.g. `get`, `select-keys`... it's a map
    ;; backed by a pointer (memory segment) + a component).
    (vf/-get-c wptr :bob Position)

    ;; Override position.
    (vf/-set-c wptr :bob [(Position {:x 20 :y 30})])

    ;; Create another entity.
    (vf/-set-c wptr :alice [(Position {:x 10 :y 20})])

    ;; Add a tag in a separate step.
    (vf/-set-c wptr :alice [:walking])

    ;; Check all the components (including the ones we hide from you) of an
    ;; entity in string format.
    ;; TODO Hash map representation just like as we have in vybe.api.
    (vf/type-str wptr :alice)
    #_(let [{:keys [array count]}
            (-> (vf.c/ecs-get-type wptr (vf/ent wptr :alice))
                (p->map (-to-c (ecs_type_t/layout))))]
        (mapv (fn [idx]
                (.getAtIndex array ValueLayout/JAVA_LONG idx))
              (range count)))

    ;; Remove tag.
    (vf/-remove-c wptr :alice [:walking])

    ;; Iterate over all the entities with Position.
    (let [it (vf.c/ecs-each-id wptr (vf/ent wptr Position))
          *acc (atom [])]
      (while (vf.c/ecs-each-next it)
        (let [pos (vf.c/ecs-field-w-size it (.byteSize (.layout Position)) 0)]
          (swap! *acc conj
                 (mapv (fn [^long idx]
                         [(-> (vf.c/ecs-get-name wptr (.getAtIndex ^MemorySegment (:entities it)
                                                                   ValueLayout/JAVA_LONG
                                                                   idx))
                              vp/->string)
                          (->> (vp/p->map (.asSlice ^MemorySegment pos
                                                    (* idx (.byteSize (.layout Position)))
                                                    (.layout Position))
                                          Position)
                               (into {}))])
                       (range (:count it))))))
      (swap! *acc #(apply concat %))
      #_(vf.c/ecs-fini wptr)
      (is (= #{["bob" {:x 20.0, :y 30.0}]
               ["alice" {:x 10.0, :y 20.0}]}
             (set @*acc))))))

;; Based on https://github.com/SanderMertens/flecs/blob/master/examples/c/entities/basics/src/main.c
(deftest ex-1-w-map
  ;; Create the world.
  (let [w (vf/make-world)]
    #_(def w (vf/make-world))
    #_(def w w)

    ;; We can also do the same thing as in `ex-1`, but using a clojure hash map
    ;; representation of the world. You can use the clojure functions you are
    ;; used to. It's a mutable map, though, e.g. `assoc` mutates it in place.

    ;; Let's setup some entities.
    (merge w {:bob [:walking (Position {:x 10 :y 20}) nil]
              :alice [(Position {:x 10 :y 21})]})

    ;; Get the position component of an entity.
    (get-in w [:bob Position])
    ;; Or a value from the component (hash map magic!! *backed by pointers).
    (get-in w [:bob Position :y])
    ;; Or whatever you need from it.
    (-> (get-in w [:bob Position])
        (select-keys [:y]))

    ;; Override position.
    (assoc w :bob (Position {:x 20 :y 30}))

    ;; Add a tag in a separate step.
    (assoc w :alice :walking)

    ;; Check all the components (including the ones we hide from you) of an
    ;; entity in string format.
    ;; TODO Hash map representation just like as we have in vybe.api.
    (vf/type-str (:alice w))

    ;; Remove tag.
    (-> w
        (update :alice disj :walking)
        ;; Update x field in Position (maps everywhere!).
        (update-in [:bob Position :x] inc))

    ;; Iterate over all the entities with Position using `with-each`, also
    ;; retrieving the positions.
    (is (= '[[#{:alice #:vybe.flecs{Position {:x 10.0, :y 21.0}}}
              #:vybe.flecs{Position {:x 10.0, :y 21.0}}]
             [#{:bob :walking #:vybe.flecs{Position {:x 21.0, :y 30.0}}}
              #:vybe.flecs{Position {:x 21.0, :y 30.0}}]]
           (->edn (vf/with-each w [pos Position, e :vf/entity]
                    [e pos]))))

    ;; `with-system` has basically the same interface as
    ;; `with-each`. The differences are that `with-system` requires a
    ;; :vf/name (you put it in the bindings, see below) and it won't
    ;; run the code in place, but will build a Flecs system that can be run
    ;; with `system-run`.
    (let [*acc (atom [])
          ;; Note that we need to accumulate values here explictly as `with-system`
          ;; doesn't run the system immediately.
          system-id (vf/with-system w [:vf/name :my-system, pos Position, e :vf/entity]
                      (swap! *acc conj [e pos]))]

      (testing "system has not run yet"
        (is (= '[]
               (->edn @*acc))))

      (vf/system-run w :my-system)
      (testing "system has run"
        (is (= '[[#{:alice #:vybe.flecs{Position {:x 10.0, :y 21.0}}}
                  #:vybe.flecs{Position {:x 10.0, :y 21.0}}]
                 [#{:bob :walking #:vybe.flecs{Position {:x 21.0, :y 30.0}}}
                  #:vybe.flecs{Position {:x 21.0, :y 30.0}}]]
               (->edn @*acc))))

      (vf/progress w)
      (testing "system has run again, now using vf/progress, if there was no iter change, system won't really run"
        (is (= '[[#{:alice #:vybe.flecs{Position {:x 10.0, :y 21.0}}}
                  #:vybe.flecs{Position {:x 10.0, :y 21.0}}]
                 [#{:bob :walking #:vybe.flecs{Position {:x 21.0, :y 30.0}}}
                  #:vybe.flecs{Position {:x 21.0, :y 30.0}}]]
               (->edn @*acc))))

      (testing "adding it twice returns a different entity"
        (is (not= system-id
                  (vf/with-system w [:vf/name :my-system, pos Position]
                    pos)))))))

;; Based on https://github.com/SanderMertens/flecs/blob/master/examples/c/entities/hierarchy/src/main.c
(deftest children-test
  (let [w (vf/make-world #_{:debug true})]
    #_(def w (vf/make-world))
    #_(def w w)

    (merge w {:sun [:star (Position {:x 1 :y 1})
                    ;; These are all children.
                    {:mercury [:planet (Position {:x 1 :y 1})]
                     :venus [:planet (Position {:x 2 :y 2})
                             ;; NESTED!
                             {:moon [:moon (Position {:x 0.1 :y 0.1})]}]}]
              ;; You can also define children like below.
              :earth [:planet (Position {:x 3 :y 3}) [:vf/child-of :sun]]})
    (is (= `{:sun #{#:vybe.flecs{Position {:x 1.0 :y 1.0}} :star}
             :mercury #{#:vybe.flecs{Position {:x 1.0 :y 1.0}} [:vf/child-of :sun] :planet}
             :venus #{[:vf/child-of :sun] #:vybe.flecs{Position {:x 2.0 :y 2.0}} :planet}
             :earth #{[:vf/child-of :sun] #:vybe.flecs{Position {:x 3.0 :y 3.0}} :planet}
             :moon #{:moon #:vybe.flecs{Position {:x 0.1 :y 0.1}} [:vf/child-of :venus]}}
           (->edn w)))))

;; Based on https://github.com/SanderMertens/flecs/blob/master/examples/cpp/entities/prefab/src/main.cpp
;; and https://github.com/SanderMertens/flecs/blob/master/examples/c/prefabs/variant/src/main.c
;; Re: overriding, check See https://www.flecs.dev/flecs/md_docs_2Manual.html#automatic-overriding
(deftest prefab-test
  (let [w (vf/make-world #_{:debug true})
        ;; You can defined multiple components like this, these won't
        ;; be global as the `defcomp` ones are.
        {:syms [Attack Defense FreightCapacity ImpulseSpeed Position]}
        (vp/make-components
         '{Attack [[:value :double]]
           Defense [[:value :double]]
           FreightCapacity [[:value :double]]
           ImpulseSpeed [[:value :double]]
           Position [[:x :double] [:y :double]]})]
    #_(def w (vf/make-world))
    #_(def w w)

    ;; Prefabs are template-like entities that you can use to define other
    ;; entities. See how :mammoth has
    (merge w {:spaceship [:vf/prefab (ImpulseSpeed 50) (Defense 50)
                          ;; Position will always be overriden, it means that
                          ;; the prefab Position component will be used only
                          ;; for the initial construction of the new entity,
                          ;; being decoupled from it afterwards.
                          (vf/override (Position {:x 30 :y 20}))]
              :freighter [:vf/prefab (vf/is-a :spaceship) :has-ftl
                          (FreightCapacity 100) (Defense 100)
                          ;; The child of a prefab is also a prefab.
                          {:mammoth-freighter [(vf/is-a :freighter)
                                               (FreightCapacity 500) (Defense 300)]}]
              :frigate [:vf/prefab (vf/is-a :spaceship) :has-ftl
                        (Attack 100) (Defense 75) (ImpulseSpeed 125)]
              :mammoth [(vf/is-a :mammoth-freighter)]
              :mammoth-2 [(vf/is-a :mammoth-freighter)
                          ;; FreightCapacity is overriden.
                          (FreightCapacity -51)]})
    ;; When you update a prefab, entities inheriting from it wil
    ;; get updated as well (as long as it's not overriden).
    (update-in w [:mammoth-freighter Defense :value] inc)
    (is (= '[["mammoth"
              {Position {:x 31.0, :y 20.0}}
              {ImpulseSpeed {:value 50.0}}
              {Defense {:value -500.0}}
              {FreightCapacity {:value 499.0}}]
             ["mammoth-2"
              {Position {:x 30.0, :y 20.0}}
              {ImpulseSpeed {:value 50.0}}
              {Defense {:value 300.0}}
              {FreightCapacity {:value -51.0}}]]
           (->edn
            ;; You can iterate over all the inherited components.
            (vf/with-each w [e :vf/entity, pos Position, speed ImpulseSpeed
                             defense Defense, capacity FreightCapacity]
              (if (= e (vf/make-entity w :mammoth))
                ;; We modify capacity, defense and position here when :mammoth, note
                ;; how only defense will be changed in both (as it's originally from the
                ;; prefab) while capacity and position are not shared (as they are
                ;; overridden).
                [(vf/get-name e) (update pos :x inc) speed (assoc defense :value -500) (update capacity :value dec)]
                [(vf/get-name e) pos speed defense capacity])))))))

(deftest pair-wildcard-test
  (is (= '[[{A {:x 34.0}} [:a :c]] [{A {:x 34.0}} [:a :d]]]
         (let [w (vf/make-world)
               A (vp/make-component 'A [[:x :double]])]
           (merge w {:b [(A {:x 34})
                         [:a :c]
                         [:a :d]]})
           (->edn
            (vf/with-each w [a A
                             v [:a :*]]
              [a v]))))))

#_(deftest pair-any-test
    (is (= #_'[[{A {:x 34.0}} [:a :c]] [{A {:x 34.0}} [:a :d]]]
           0
           (let [w (vf/make-world)
                 A (vp/make-component 'A [[:x :double]])]
             (merge w {:b [(A {:x 34})
                           [:a :c]
                           [:a :d]]})
             (->edn
              (vf/with-each w [a A
                               v [:a :_]]
                [a v]))))))
