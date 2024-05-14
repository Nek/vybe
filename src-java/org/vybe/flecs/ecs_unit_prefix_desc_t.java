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
 * struct ecs_unit_prefix_desc_t {
 *     ecs_entity_t entity;
 *     const char *symbol;
 *     ecs_unit_translation_t translation;
 * }
 * }
 */
public class ecs_unit_prefix_desc_t {

    ecs_unit_prefix_desc_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_LONG_LONG.withName("entity"),
        flecs.C_POINTER.withName("symbol"),
        ecs_unit_translation_t.layout().withName("translation")
    ).withName("ecs_unit_prefix_desc_t");

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

    private static final AddressLayout symbol$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("symbol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *symbol
     * }
     */
    public static final AddressLayout symbol$layout() {
        return symbol$LAYOUT;
    }

    private static final long symbol$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *symbol
     * }
     */
    public static final long symbol$offset() {
        return symbol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *symbol
     * }
     */
    public static MemorySegment symbol(MemorySegment struct) {
        return struct.get(symbol$LAYOUT, symbol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *symbol
     * }
     */
    public static void symbol(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(symbol$LAYOUT, symbol$OFFSET, fieldValue);
    }

    private static final GroupLayout translation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("translation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_unit_translation_t translation
     * }
     */
    public static final GroupLayout translation$layout() {
        return translation$LAYOUT;
    }

    private static final long translation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_unit_translation_t translation
     * }
     */
    public static final long translation$offset() {
        return translation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_unit_translation_t translation
     * }
     */
    public static MemorySegment translation(MemorySegment struct) {
        return struct.asSlice(translation$OFFSET, translation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_unit_translation_t translation
     * }
     */
    public static void translation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, translation$OFFSET, translation$LAYOUT.byteSize());
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

