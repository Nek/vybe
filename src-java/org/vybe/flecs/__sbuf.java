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
 * struct __sbuf {
 *     unsigned char *_base;
 *     int _size;
 * }
 * }
 */
public class __sbuf {

    __sbuf() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_POINTER.withName("_base"),
        flecs.C_INT.withName("_size"),
        MemoryLayout.paddingLayout(4)
    ).withName("__sbuf");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout _base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *_base
     * }
     */
    public static final AddressLayout _base$layout() {
        return _base$LAYOUT;
    }

    private static final long _base$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *_base
     * }
     */
    public static final long _base$offset() {
        return _base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *_base
     * }
     */
    public static MemorySegment _base(MemorySegment struct) {
        return struct.get(_base$LAYOUT, _base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *_base
     * }
     */
    public static void _base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_base$LAYOUT, _base$OFFSET, fieldValue);
    }

    private static final OfInt _size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _size
     * }
     */
    public static final OfInt _size$layout() {
        return _size$LAYOUT;
    }

    private static final long _size$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _size
     * }
     */
    public static final long _size$offset() {
        return _size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _size
     * }
     */
    public static int _size(MemorySegment struct) {
        return struct.get(_size$LAYOUT, _size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _size
     * }
     */
    public static void _size(MemorySegment struct, int fieldValue) {
        struct.set(_size$LAYOUT, _size$OFFSET, fieldValue);
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

