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
 * struct ecs_type_info_t {
 *     ecs_size_t size;
 *     ecs_size_t alignment;
 *     ecs_type_hooks_t hooks;
 *     ecs_entity_t component;
 *     const char *name;
 * }
 * }
 */
public class ecs_type_info_t {

    ecs_type_info_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_INT.withName("size"),
        flecs.C_INT.withName("alignment"),
        ecs_type_hooks_t.layout().withName("hooks"),
        flecs.C_LONG_LONG.withName("component"),
        flecs.C_POINTER.withName("name")
    ).withName("ecs_type_info_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_size_t size
     * }
     */
    public static final OfInt size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_size_t size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_size_t size
     * }
     */
    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_size_t size
     * }
     */
    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final OfInt alignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_size_t alignment
     * }
     */
    public static final OfInt alignment$layout() {
        return alignment$LAYOUT;
    }

    private static final long alignment$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_size_t alignment
     * }
     */
    public static final long alignment$offset() {
        return alignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_size_t alignment
     * }
     */
    public static int alignment(MemorySegment struct) {
        return struct.get(alignment$LAYOUT, alignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_size_t alignment
     * }
     */
    public static void alignment(MemorySegment struct, int fieldValue) {
        struct.set(alignment$LAYOUT, alignment$OFFSET, fieldValue);
    }

    private static final GroupLayout hooks$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("hooks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_type_hooks_t hooks
     * }
     */
    public static final GroupLayout hooks$layout() {
        return hooks$LAYOUT;
    }

    private static final long hooks$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_type_hooks_t hooks
     * }
     */
    public static final long hooks$offset() {
        return hooks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_type_hooks_t hooks
     * }
     */
    public static MemorySegment hooks(MemorySegment struct) {
        return struct.asSlice(hooks$OFFSET, hooks$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_type_hooks_t hooks
     * }
     */
    public static void hooks(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, hooks$OFFSET, hooks$LAYOUT.byteSize());
    }

    private static final OfLong component$LAYOUT = (OfLong)$LAYOUT.select(groupElement("component"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_entity_t component
     * }
     */
    public static final OfLong component$layout() {
        return component$LAYOUT;
    }

    private static final long component$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_entity_t component
     * }
     */
    public static final long component$offset() {
        return component$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_entity_t component
     * }
     */
    public static long component(MemorySegment struct) {
        return struct.get(component$LAYOUT, component$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_entity_t component
     * }
     */
    public static void component(MemorySegment struct, long fieldValue) {
        struct.set(component$LAYOUT, component$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
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

