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
 * struct EcsDefaultChildComponent {
 *     ecs_id_t component;
 * }
 * }
 */
public class EcsDefaultChildComponent {

    EcsDefaultChildComponent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_LONG_LONG.withName("component")
    ).withName("EcsDefaultChildComponent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong component$LAYOUT = (OfLong)$LAYOUT.select(groupElement("component"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_id_t component
     * }
     */
    public static final OfLong component$layout() {
        return component$LAYOUT;
    }

    private static final long component$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_id_t component
     * }
     */
    public static final long component$offset() {
        return component$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_id_t component
     * }
     */
    public static long component(MemorySegment struct) {
        return struct.get(component$LAYOUT, component$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_id_t component
     * }
     */
    public static void component(MemorySegment struct, long fieldValue) {
        struct.set(component$LAYOUT, component$OFFSET, fieldValue);
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

