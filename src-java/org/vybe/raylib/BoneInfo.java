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
 * struct BoneInfo {
 *     char name[32];
 *     int parent;
 * }
 * }
 */
public class BoneInfo {

    BoneInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(32, raylib.C_CHAR).withName("name"),
        raylib.C_INT.withName("parent")
    ).withName("BoneInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static final SequenceLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.asSlice(name$OFFSET, name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, name$OFFSET, name$LAYOUT.byteSize());
    }

    private static long[] name$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static long[] name$dimensions() {
        return name$DIMS;
    }
    private static final VarHandle name$ELEM_HANDLE = name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static byte name(MemorySegment struct, long index0) {
        return (byte)name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char name[32]
     * }
     */
    public static void name(MemorySegment struct, long index0, byte fieldValue) {
        name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt parent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("parent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int parent
     * }
     */
    public static final OfInt parent$layout() {
        return parent$LAYOUT;
    }

    private static final long parent$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int parent
     * }
     */
    public static final long parent$offset() {
        return parent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int parent
     * }
     */
    public static int parent(MemorySegment struct) {
        return struct.get(parent$LAYOUT, parent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int parent
     * }
     */
    public static void parent(MemorySegment struct, int fieldValue) {
        struct.set(parent$LAYOUT, parent$OFFSET, fieldValue);
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

