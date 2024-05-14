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
 * struct EcsPoly {
 *     flecs_poly_t *poly;
 * }
 * }
 */
public class EcsPoly {

    EcsPoly() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_POINTER.withName("poly")
    ).withName("EcsPoly");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout poly$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("poly"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * flecs_poly_t *poly
     * }
     */
    public static final AddressLayout poly$layout() {
        return poly$LAYOUT;
    }

    private static final long poly$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * flecs_poly_t *poly
     * }
     */
    public static final long poly$offset() {
        return poly$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * flecs_poly_t *poly
     * }
     */
    public static MemorySegment poly(MemorySegment struct) {
        return struct.get(poly$LAYOUT, poly$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * flecs_poly_t *poly
     * }
     */
    public static void poly(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(poly$LAYOUT, poly$OFFSET, fieldValue);
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

