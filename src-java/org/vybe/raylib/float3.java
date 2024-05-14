// Generated by jextract

package org.vybe.raylib;

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
 * struct float3 {
 *     float v[3];
 * }
 * }
 */
public class float3 {

    float3() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, raylib.C_FLOAT).withName("v")
    ).withName("float3");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout v$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("v"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static final SequenceLayout v$layout() {
        return v$LAYOUT;
    }

    private static final long v$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static final long v$offset() {
        return v$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static MemorySegment v(MemorySegment struct) {
        return struct.asSlice(v$OFFSET, v$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static void v(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, v$OFFSET, v$LAYOUT.byteSize());
    }

    private static long[] v$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static long[] v$dimensions() {
        return v$DIMS;
    }
    private static final VarHandle v$ELEM_HANDLE = v$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static float v(MemorySegment struct, long index0) {
        return (float)v$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float v[3]
     * }
     */
    public static void v(MemorySegment struct, long index0, float fieldValue) {
        v$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

