// Generated by jextract

package org.vybe.flecs;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct ecs_iter_private_t {
 *     union {
 *         ecs_query_iter_t query;
 *         ecs_page_iter_t page;
 *         ecs_worker_iter_t worker;
 *         ecs_each_iter_t each;
 *     } iter;
 *     void *entity_iter;
 *     ecs_iter_cache_t cache;
 * }
 * }
 */
public class ecs_iter_private_t {

    ecs_iter_private_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ecs_iter_private_t.iter.layout().withName("iter"),
        flecs.C_POINTER.withName("entity_iter"),
        ecs_iter_cache_t.layout().withName("cache")
    ).withName("ecs_iter_private_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * union {
     *     ecs_query_iter_t query;
     *     ecs_page_iter_t page;
     *     ecs_worker_iter_t worker;
     *     ecs_each_iter_t each;
     * }
     * }
     */
    public static class iter {

        iter() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            ecs_query_iter_t.layout().withName("query"),
            ecs_page_iter_t.layout().withName("page"),
            ecs_worker_iter_t.layout().withName("worker"),
            ecs_each_iter_t.layout().withName("each")
        ).withName("$anon$3370:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout query$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("query"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * ecs_query_iter_t query
         * }
         */
        public static final GroupLayout query$layout() {
            return query$LAYOUT;
        }

        private static final long query$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * ecs_query_iter_t query
         * }
         */
        public static final long query$offset() {
            return query$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * ecs_query_iter_t query
         * }
         */
        public static MemorySegment query(MemorySegment union) {
            return union.asSlice(query$OFFSET, query$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * ecs_query_iter_t query
         * }
         */
        public static void query(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, query$OFFSET, query$LAYOUT.byteSize());
        }

        private static final GroupLayout page$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("page"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * ecs_page_iter_t page
         * }
         */
        public static final GroupLayout page$layout() {
            return page$LAYOUT;
        }

        private static final long page$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * ecs_page_iter_t page
         * }
         */
        public static final long page$offset() {
            return page$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * ecs_page_iter_t page
         * }
         */
        public static MemorySegment page(MemorySegment union) {
            return union.asSlice(page$OFFSET, page$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * ecs_page_iter_t page
         * }
         */
        public static void page(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, page$OFFSET, page$LAYOUT.byteSize());
        }

        private static final GroupLayout worker$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("worker"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * ecs_worker_iter_t worker
         * }
         */
        public static final GroupLayout worker$layout() {
            return worker$LAYOUT;
        }

        private static final long worker$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * ecs_worker_iter_t worker
         * }
         */
        public static final long worker$offset() {
            return worker$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * ecs_worker_iter_t worker
         * }
         */
        public static MemorySegment worker(MemorySegment union) {
            return union.asSlice(worker$OFFSET, worker$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * ecs_worker_iter_t worker
         * }
         */
        public static void worker(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, worker$OFFSET, worker$LAYOUT.byteSize());
        }

        private static final GroupLayout each$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("each"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * ecs_each_iter_t each
         * }
         */
        public static final GroupLayout each$layout() {
            return each$LAYOUT;
        }

        private static final long each$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * ecs_each_iter_t each
         * }
         */
        public static final long each$offset() {
            return each$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * ecs_each_iter_t each
         * }
         */
        public static MemorySegment each(MemorySegment union) {
            return union.asSlice(each$OFFSET, each$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * ecs_each_iter_t each
         * }
         */
        public static void each(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, each$OFFSET, each$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout iter$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("iter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     ecs_query_iter_t query;
     *     ecs_page_iter_t page;
     *     ecs_worker_iter_t worker;
     *     ecs_each_iter_t each;
     * } iter
     * }
     */
    public static final GroupLayout iter$layout() {
        return iter$LAYOUT;
    }

    private static final long iter$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     ecs_query_iter_t query;
     *     ecs_page_iter_t page;
     *     ecs_worker_iter_t worker;
     *     ecs_each_iter_t each;
     * } iter
     * }
     */
    public static final long iter$offset() {
        return iter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     ecs_query_iter_t query;
     *     ecs_page_iter_t page;
     *     ecs_worker_iter_t worker;
     *     ecs_each_iter_t each;
     * } iter
     * }
     */
    public static MemorySegment iter(MemorySegment struct) {
        return struct.asSlice(iter$OFFSET, iter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     ecs_query_iter_t query;
     *     ecs_page_iter_t page;
     *     ecs_worker_iter_t worker;
     *     ecs_each_iter_t each;
     * } iter
     * }
     */
    public static void iter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, iter$OFFSET, iter$LAYOUT.byteSize());
    }

    private static final AddressLayout entity_iter$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("entity_iter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *entity_iter
     * }
     */
    public static final AddressLayout entity_iter$layout() {
        return entity_iter$LAYOUT;
    }

    private static final long entity_iter$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *entity_iter
     * }
     */
    public static final long entity_iter$offset() {
        return entity_iter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *entity_iter
     * }
     */
    public static MemorySegment entity_iter(MemorySegment struct) {
        return struct.get(entity_iter$LAYOUT, entity_iter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *entity_iter
     * }
     */
    public static void entity_iter(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(entity_iter$LAYOUT, entity_iter$OFFSET, fieldValue);
    }

    private static final GroupLayout cache$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("cache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_iter_cache_t cache
     * }
     */
    public static final GroupLayout cache$layout() {
        return cache$LAYOUT;
    }

    private static final long cache$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_iter_cache_t cache
     * }
     */
    public static final long cache$offset() {
        return cache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_iter_cache_t cache
     * }
     */
    public static MemorySegment cache(MemorySegment struct) {
        return struct.asSlice(cache$OFFSET, cache$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_iter_cache_t cache
     * }
     */
    public static void cache(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cache$OFFSET, cache$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

