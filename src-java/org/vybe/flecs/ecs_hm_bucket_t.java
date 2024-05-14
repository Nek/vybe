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
 * struct {
 *     ecs_vec_t keys;
 *     ecs_vec_t values;
 * }
 * }
 */
public class ecs_hm_bucket_t {

    ecs_hm_bucket_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ecs_vec_t.layout().withName("keys"),
        ecs_vec_t.layout().withName("values")
    ).withName("$anon$3615:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout keys$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("keys"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_vec_t keys
     * }
     */
    public static final GroupLayout keys$layout() {
        return keys$LAYOUT;
    }

    private static final long keys$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_vec_t keys
     * }
     */
    public static final long keys$offset() {
        return keys$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_vec_t keys
     * }
     */
    public static MemorySegment keys(MemorySegment struct) {
        return struct.asSlice(keys$OFFSET, keys$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_vec_t keys
     * }
     */
    public static void keys(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, keys$OFFSET, keys$LAYOUT.byteSize());
    }

    private static final GroupLayout values$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("values"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_vec_t values
     * }
     */
    public static final GroupLayout values$layout() {
        return values$LAYOUT;
    }

    private static final long values$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_vec_t values
     * }
     */
    public static final long values$offset() {
        return values$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_vec_t values
     * }
     */
    public static MemorySegment values(MemorySegment struct) {
        return struct.asSlice(values$OFFSET, values$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_vec_t values
     * }
     */
    public static void values(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, values$OFFSET, values$LAYOUT.byteSize());
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

