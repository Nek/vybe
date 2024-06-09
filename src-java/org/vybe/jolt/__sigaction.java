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
 * struct __sigaction {
 *     union __sigaction_u __sigaction_u;
 *     void (*sa_tramp)(void *, int, int, siginfo_t *, void *);
 *     sigset_t sa_mask;
 *     int sa_flags;
 * }
 * }
 */
public class __sigaction {

    __sigaction() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        __sigaction_u.layout().withName("__sigaction_u"),
        jolt.C_POINTER.withName("sa_tramp"),
        jolt.C_INT.withName("sa_mask"),
        jolt.C_INT.withName("sa_flags")
    ).withName("__sigaction");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout __sigaction_u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__sigaction_u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union __sigaction_u __sigaction_u
     * }
     */
    public static final GroupLayout __sigaction_u$layout() {
        return __sigaction_u$LAYOUT;
    }

    private static final long __sigaction_u$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union __sigaction_u __sigaction_u
     * }
     */
    public static final long __sigaction_u$offset() {
        return __sigaction_u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union __sigaction_u __sigaction_u
     * }
     */
    public static MemorySegment __sigaction_u(MemorySegment struct) {
        return struct.asSlice(__sigaction_u$OFFSET, __sigaction_u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union __sigaction_u __sigaction_u
     * }
     */
    public static void __sigaction_u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __sigaction_u$OFFSET, __sigaction_u$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*sa_tramp)(void *, int, int, siginfo_t *, void *)
     * }
     */
    public static class sa_tramp {

        sa_tramp() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            jolt.C_POINTER,
            jolt.C_INT,
            jolt.C_INT,
            jolt.C_POINTER,
            jolt.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = jolt.upcallHandle(sa_tramp.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(sa_tramp.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout sa_tramp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sa_tramp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*sa_tramp)(void *, int, int, siginfo_t *, void *)
     * }
     */
    public static final AddressLayout sa_tramp$layout() {
        return sa_tramp$LAYOUT;
    }

    private static final long sa_tramp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*sa_tramp)(void *, int, int, siginfo_t *, void *)
     * }
     */
    public static final long sa_tramp$offset() {
        return sa_tramp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*sa_tramp)(void *, int, int, siginfo_t *, void *)
     * }
     */
    public static MemorySegment sa_tramp(MemorySegment struct) {
        return struct.get(sa_tramp$LAYOUT, sa_tramp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*sa_tramp)(void *, int, int, siginfo_t *, void *)
     * }
     */
    public static void sa_tramp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sa_tramp$LAYOUT, sa_tramp$OFFSET, fieldValue);
    }

    private static final OfInt sa_mask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sa_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * sigset_t sa_mask
     * }
     */
    public static final OfInt sa_mask$layout() {
        return sa_mask$LAYOUT;
    }

    private static final long sa_mask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * sigset_t sa_mask
     * }
     */
    public static final long sa_mask$offset() {
        return sa_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * sigset_t sa_mask
     * }
     */
    public static int sa_mask(MemorySegment struct) {
        return struct.get(sa_mask$LAYOUT, sa_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * sigset_t sa_mask
     * }
     */
    public static void sa_mask(MemorySegment struct, int fieldValue) {
        struct.set(sa_mask$LAYOUT, sa_mask$OFFSET, fieldValue);
    }

    private static final OfInt sa_flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sa_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sa_flags
     * }
     */
    public static final OfInt sa_flags$layout() {
        return sa_flags$LAYOUT;
    }

    private static final long sa_flags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sa_flags
     * }
     */
    public static final long sa_flags$offset() {
        return sa_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sa_flags
     * }
     */
    public static int sa_flags(MemorySegment struct) {
        return struct.get(sa_flags$LAYOUT, sa_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sa_flags
     * }
     */
    public static void sa_flags(MemorySegment struct, int fieldValue) {
        struct.set(sa_flags$LAYOUT, sa_flags$OFFSET, fieldValue);
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

