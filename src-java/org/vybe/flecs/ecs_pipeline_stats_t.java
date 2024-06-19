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
 * struct ecs_pipeline_stats_t {
 *     int8_t canary_;
 *     ecs_vec_t systems;
 *     ecs_vec_t sync_points;
 *     int32_t t;
 *     int32_t system_count;
 *     int32_t active_system_count;
 *     int32_t rebuild_count;
 * }
 * }
 */
public class ecs_pipeline_stats_t {

    ecs_pipeline_stats_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_CHAR.withName("canary_"),
        MemoryLayout.paddingLayout(7),
        ecs_vec_t.layout().withName("systems"),
        ecs_vec_t.layout().withName("sync_points"),
        flecs.C_INT.withName("t"),
        flecs.C_INT.withName("system_count"),
        flecs.C_INT.withName("active_system_count"),
        flecs.C_INT.withName("rebuild_count")
    ).withName("ecs_pipeline_stats_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte canary_$LAYOUT = (OfByte)$LAYOUT.select(groupElement("canary_"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t canary_
     * }
     */
    public static final OfByte canary_$layout() {
        return canary_$LAYOUT;
    }

    private static final long canary_$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t canary_
     * }
     */
    public static final long canary_$offset() {
        return canary_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t canary_
     * }
     */
    public static byte canary_(MemorySegment struct) {
        return struct.get(canary_$LAYOUT, canary_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t canary_
     * }
     */
    public static void canary_(MemorySegment struct, byte fieldValue) {
        struct.set(canary_$LAYOUT, canary_$OFFSET, fieldValue);
    }

    private static final GroupLayout systems$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("systems"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_vec_t systems
     * }
     */
    public static final GroupLayout systems$layout() {
        return systems$LAYOUT;
    }

    private static final long systems$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_vec_t systems
     * }
     */
    public static final long systems$offset() {
        return systems$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_vec_t systems
     * }
     */
    public static MemorySegment systems(MemorySegment struct) {
        return struct.asSlice(systems$OFFSET, systems$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_vec_t systems
     * }
     */
    public static void systems(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, systems$OFFSET, systems$LAYOUT.byteSize());
    }

    private static final GroupLayout sync_points$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sync_points"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_vec_t sync_points
     * }
     */
    public static final GroupLayout sync_points$layout() {
        return sync_points$LAYOUT;
    }

    private static final long sync_points$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_vec_t sync_points
     * }
     */
    public static final long sync_points$offset() {
        return sync_points$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_vec_t sync_points
     * }
     */
    public static MemorySegment sync_points(MemorySegment struct) {
        return struct.asSlice(sync_points$OFFSET, sync_points$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_vec_t sync_points
     * }
     */
    public static void sync_points(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sync_points$OFFSET, sync_points$LAYOUT.byteSize());
    }

    private static final OfInt t$LAYOUT = (OfInt)$LAYOUT.select(groupElement("t"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t t
     * }
     */
    public static final OfInt t$layout() {
        return t$LAYOUT;
    }

    private static final long t$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t t
     * }
     */
    public static final long t$offset() {
        return t$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t t
     * }
     */
    public static int t(MemorySegment struct) {
        return struct.get(t$LAYOUT, t$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t t
     * }
     */
    public static void t(MemorySegment struct, int fieldValue) {
        struct.set(t$LAYOUT, t$OFFSET, fieldValue);
    }

    private static final OfInt system_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("system_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t system_count
     * }
     */
    public static final OfInt system_count$layout() {
        return system_count$LAYOUT;
    }

    private static final long system_count$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t system_count
     * }
     */
    public static final long system_count$offset() {
        return system_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t system_count
     * }
     */
    public static int system_count(MemorySegment struct) {
        return struct.get(system_count$LAYOUT, system_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t system_count
     * }
     */
    public static void system_count(MemorySegment struct, int fieldValue) {
        struct.set(system_count$LAYOUT, system_count$OFFSET, fieldValue);
    }

    private static final OfInt active_system_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("active_system_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t active_system_count
     * }
     */
    public static final OfInt active_system_count$layout() {
        return active_system_count$LAYOUT;
    }

    private static final long active_system_count$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t active_system_count
     * }
     */
    public static final long active_system_count$offset() {
        return active_system_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t active_system_count
     * }
     */
    public static int active_system_count(MemorySegment struct) {
        return struct.get(active_system_count$LAYOUT, active_system_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t active_system_count
     * }
     */
    public static void active_system_count(MemorySegment struct, int fieldValue) {
        struct.set(active_system_count$LAYOUT, active_system_count$OFFSET, fieldValue);
    }

    private static final OfInt rebuild_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rebuild_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t rebuild_count
     * }
     */
    public static final OfInt rebuild_count$layout() {
        return rebuild_count$LAYOUT;
    }

    private static final long rebuild_count$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t rebuild_count
     * }
     */
    public static final long rebuild_count$offset() {
        return rebuild_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t rebuild_count
     * }
     */
    public static int rebuild_count(MemorySegment struct) {
        return struct.get(rebuild_count$LAYOUT, rebuild_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t rebuild_count
     * }
     */
    public static void rebuild_count(MemorySegment struct, int fieldValue) {
        struct.set(rebuild_count$LAYOUT, rebuild_count$OFFSET, fieldValue);
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
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

