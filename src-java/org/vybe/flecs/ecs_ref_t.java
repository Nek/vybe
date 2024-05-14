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
 * struct ecs_ref_t {
 *     ecs_entity_t entity;
 *     ecs_entity_t id;
 *     uint64_t table_id;
 *     struct ecs_table_record_t *tr;
 *     ecs_record_t *record;
 * }
 * }
 */
public class ecs_ref_t {

    ecs_ref_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_LONG_LONG.withName("entity"),
        flecs.C_LONG_LONG.withName("id"),
        flecs.C_LONG_LONG.withName("table_id"),
        flecs.C_POINTER.withName("tr"),
        flecs.C_POINTER.withName("record")
    ).withName("ecs_ref_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong entity$LAYOUT = (OfLong)$LAYOUT.select(groupElement("entity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_entity_t entity
     * }
     */
    public static final OfLong entity$layout() {
        return entity$LAYOUT;
    }

    private static final long entity$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_entity_t entity
     * }
     */
    public static final long entity$offset() {
        return entity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_entity_t entity
     * }
     */
    public static long entity(MemorySegment struct) {
        return struct.get(entity$LAYOUT, entity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_entity_t entity
     * }
     */
    public static void entity(MemorySegment struct, long fieldValue) {
        struct.set(entity$LAYOUT, entity$OFFSET, fieldValue);
    }

    private static final OfLong id$LAYOUT = (OfLong)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_entity_t id
     * }
     */
    public static final OfLong id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_entity_t id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_entity_t id
     * }
     */
    public static long id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_entity_t id
     * }
     */
    public static void id(MemorySegment struct, long fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final OfLong table_id$LAYOUT = (OfLong)$LAYOUT.select(groupElement("table_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t table_id
     * }
     */
    public static final OfLong table_id$layout() {
        return table_id$LAYOUT;
    }

    private static final long table_id$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t table_id
     * }
     */
    public static final long table_id$offset() {
        return table_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t table_id
     * }
     */
    public static long table_id(MemorySegment struct) {
        return struct.get(table_id$LAYOUT, table_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t table_id
     * }
     */
    public static void table_id(MemorySegment struct, long fieldValue) {
        struct.set(table_id$LAYOUT, table_id$OFFSET, fieldValue);
    }

    private static final AddressLayout tr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct ecs_table_record_t *tr
     * }
     */
    public static final AddressLayout tr$layout() {
        return tr$LAYOUT;
    }

    private static final long tr$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct ecs_table_record_t *tr
     * }
     */
    public static final long tr$offset() {
        return tr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct ecs_table_record_t *tr
     * }
     */
    public static MemorySegment tr(MemorySegment struct) {
        return struct.get(tr$LAYOUT, tr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct ecs_table_record_t *tr
     * }
     */
    public static void tr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tr$LAYOUT, tr$OFFSET, fieldValue);
    }

    private static final AddressLayout record_$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("record"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_record_t *record
     * }
     */
    public static final AddressLayout record_$layout() {
        return record_$LAYOUT;
    }

    private static final long record_$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_record_t *record
     * }
     */
    public static final long record_$offset() {
        return record_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_record_t *record
     * }
     */
    public static MemorySegment record_(MemorySegment struct) {
        return struct.get(record_$LAYOUT, record_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_record_t *record
     * }
     */
    public static void record_(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(record_$LAYOUT, record_$OFFSET, fieldValue);
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

