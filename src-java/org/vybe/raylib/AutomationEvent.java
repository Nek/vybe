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
 * struct AutomationEvent {
 *     unsigned int frame;
 *     unsigned int type;
 *     int params[4];
 * }
 * }
 */
public class AutomationEvent {

    AutomationEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        raylib.C_INT.withName("frame"),
        raylib.C_INT.withName("type"),
        MemoryLayout.sequenceLayout(4, raylib.C_INT).withName("params")
    ).withName("AutomationEvent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt frame$LAYOUT = (OfInt)$LAYOUT.select(groupElement("frame"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int frame
     * }
     */
    public static final OfInt frame$layout() {
        return frame$LAYOUT;
    }

    private static final long frame$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int frame
     * }
     */
    public static final long frame$offset() {
        return frame$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int frame
     * }
     */
    public static int frame(MemorySegment struct) {
        return struct.get(frame$LAYOUT, frame$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int frame
     * }
     */
    public static void frame(MemorySegment struct, int fieldValue) {
        struct.set(frame$LAYOUT, frame$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final SequenceLayout params$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("params"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static final SequenceLayout params$layout() {
        return params$LAYOUT;
    }

    private static final long params$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static final long params$offset() {
        return params$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static MemorySegment params(MemorySegment struct) {
        return struct.asSlice(params$OFFSET, params$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static void params(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, params$OFFSET, params$LAYOUT.byteSize());
    }

    private static long[] params$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static long[] params$dimensions() {
        return params$DIMS;
    }
    private static final VarHandle params$ELEM_HANDLE = params$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static int params(MemorySegment struct, long index0) {
        return (int)params$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int params[4]
     * }
     */
    public static void params(MemorySegment struct, long index0, int fieldValue) {
        params$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

