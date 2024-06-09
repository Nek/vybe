// Generated by jextract

package org.vybe.jolt;

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
 * struct JPC_ContactListenerVTable {
 *     JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *);
 *     void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *);
 *     void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *);
 *     void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *);
 * }
 * }
 */
public class JPC_ContactListenerVTable {

    JPC_ContactListenerVTable() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        jolt.C_POINTER.withName("OnContactValidate"),
        jolt.C_POINTER.withName("OnContactAdded"),
        jolt.C_POINTER.withName("OnContactPersisted"),
        jolt.C_POINTER.withName("OnContactRemoved")
    ).withName("JPC_ContactListenerVTable");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *)
     * }
     */
    public static class OnContactValidate {

        OnContactValidate() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            jolt.C_INT,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = jolt.upcallHandle(OnContactValidate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(OnContactValidate.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout OnContactValidate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OnContactValidate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *)
     * }
     */
    public static final AddressLayout OnContactValidate$layout() {
        return OnContactValidate$LAYOUT;
    }

    private static final long OnContactValidate$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *)
     * }
     */
    public static final long OnContactValidate$offset() {
        return OnContactValidate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *)
     * }
     */
    public static MemorySegment OnContactValidate(MemorySegment struct) {
        return struct.get(OnContactValidate$LAYOUT, OnContactValidate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_ValidateResult (*OnContactValidate)(void *, const JPC_Body *, const JPC_Body *, const JPC_Real *, const JPC_CollideShapeResult *)
     * }
     */
    public static void OnContactValidate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OnContactValidate$LAYOUT, OnContactValidate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static class OnContactAdded {

        OnContactAdded() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = jolt.upcallHandle(OnContactAdded.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(OnContactAdded.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout OnContactAdded$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OnContactAdded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static final AddressLayout OnContactAdded$layout() {
        return OnContactAdded$LAYOUT;
    }

    private static final long OnContactAdded$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static final long OnContactAdded$offset() {
        return OnContactAdded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static MemorySegment OnContactAdded(MemorySegment struct) {
        return struct.get(OnContactAdded$LAYOUT, OnContactAdded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*OnContactAdded)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static void OnContactAdded(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OnContactAdded$LAYOUT, OnContactAdded$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static class OnContactPersisted {

        OnContactPersisted() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER,
            jolt.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = jolt.upcallHandle(OnContactPersisted.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(OnContactPersisted.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout OnContactPersisted$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OnContactPersisted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static final AddressLayout OnContactPersisted$layout() {
        return OnContactPersisted$LAYOUT;
    }

    private static final long OnContactPersisted$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static final long OnContactPersisted$offset() {
        return OnContactPersisted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static MemorySegment OnContactPersisted(MemorySegment struct) {
        return struct.get(OnContactPersisted$LAYOUT, OnContactPersisted$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*OnContactPersisted)(void *, const JPC_Body *, const JPC_Body *, const JPC_ContactManifold *, JPC_ContactSettings *)
     * }
     */
    public static void OnContactPersisted(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OnContactPersisted$LAYOUT, OnContactPersisted$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *)
     * }
     */
    public static class OnContactRemoved {

        OnContactRemoved() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            jolt.C_POINTER,
            jolt.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = jolt.upcallHandle(OnContactRemoved.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(OnContactRemoved.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout OnContactRemoved$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OnContactRemoved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *)
     * }
     */
    public static final AddressLayout OnContactRemoved$layout() {
        return OnContactRemoved$LAYOUT;
    }

    private static final long OnContactRemoved$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *)
     * }
     */
    public static final long OnContactRemoved$offset() {
        return OnContactRemoved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *)
     * }
     */
    public static MemorySegment OnContactRemoved(MemorySegment struct) {
        return struct.get(OnContactRemoved$LAYOUT, OnContactRemoved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*OnContactRemoved)(void *, const JPC_SubShapeIDPair *)
     * }
     */
    public static void OnContactRemoved(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OnContactRemoved$LAYOUT, OnContactRemoved$OFFSET, fieldValue);
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
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

