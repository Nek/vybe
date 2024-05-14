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
 * struct ecs_map_iter_t {
 *     const ecs_map_t *map;
 *     ecs_bucket_t *bucket;
 *     ecs_bucket_entry_t *entry;
 *     ecs_map_data_t *res;
 * }
 * }
 */
public class ecs_map_iter_t {

    ecs_map_iter_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_POINTER.withName("map"),
        flecs.C_POINTER.withName("bucket"),
        flecs.C_POINTER.withName("entry"),
        flecs.C_POINTER.withName("res")
    ).withName("ecs_map_iter_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout map$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("map"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const ecs_map_t *map
     * }
     */
    public static final AddressLayout map$layout() {
        return map$LAYOUT;
    }

    private static final long map$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const ecs_map_t *map
     * }
     */
    public static final long map$offset() {
        return map$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const ecs_map_t *map
     * }
     */
    public static MemorySegment map(MemorySegment struct) {
        return struct.get(map$LAYOUT, map$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const ecs_map_t *map
     * }
     */
    public static void map(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(map$LAYOUT, map$OFFSET, fieldValue);
    }

    private static final AddressLayout bucket$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("bucket"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_bucket_t *bucket
     * }
     */
    public static final AddressLayout bucket$layout() {
        return bucket$LAYOUT;
    }

    private static final long bucket$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_bucket_t *bucket
     * }
     */
    public static final long bucket$offset() {
        return bucket$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_bucket_t *bucket
     * }
     */
    public static MemorySegment bucket(MemorySegment struct) {
        return struct.get(bucket$LAYOUT, bucket$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_bucket_t *bucket
     * }
     */
    public static void bucket(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bucket$LAYOUT, bucket$OFFSET, fieldValue);
    }

    private static final AddressLayout entry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("entry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_bucket_entry_t *entry
     * }
     */
    public static final AddressLayout entry$layout() {
        return entry$LAYOUT;
    }

    private static final long entry$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_bucket_entry_t *entry
     * }
     */
    public static final long entry$offset() {
        return entry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_bucket_entry_t *entry
     * }
     */
    public static MemorySegment entry(MemorySegment struct) {
        return struct.get(entry$LAYOUT, entry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_bucket_entry_t *entry
     * }
     */
    public static void entry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(entry$LAYOUT, entry$OFFSET, fieldValue);
    }

    private static final AddressLayout res$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("res"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_map_data_t *res
     * }
     */
    public static final AddressLayout res$layout() {
        return res$LAYOUT;
    }

    private static final long res$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_map_data_t *res
     * }
     */
    public static final long res$offset() {
        return res$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_map_data_t *res
     * }
     */
    public static MemorySegment res(MemorySegment struct) {
        return struct.get(res$LAYOUT, res$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_map_data_t *res
     * }
     */
    public static void res(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(res$LAYOUT, res$OFFSET, fieldValue);
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

