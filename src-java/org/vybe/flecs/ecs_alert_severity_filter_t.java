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
 * struct ecs_alert_severity_filter_t {
 *     ecs_entity_t severity;
 *     ecs_id_t with;
 *     const char *var;
 *     int32_t _var_index;
 * }
 * }
 */
public class ecs_alert_severity_filter_t {

    ecs_alert_severity_filter_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_LONG_LONG.withName("severity"),
        flecs.C_LONG_LONG.withName("with"),
        flecs.C_POINTER.withName("var"),
        flecs.C_INT.withName("_var_index"),
        MemoryLayout.paddingLayout(4)
    ).withName("ecs_alert_severity_filter_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong severity$LAYOUT = (OfLong)$LAYOUT.select(groupElement("severity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_entity_t severity
     * }
     */
    public static final OfLong severity$layout() {
        return severity$LAYOUT;
    }

    private static final long severity$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_entity_t severity
     * }
     */
    public static final long severity$offset() {
        return severity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_entity_t severity
     * }
     */
    public static long severity(MemorySegment struct) {
        return struct.get(severity$LAYOUT, severity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_entity_t severity
     * }
     */
    public static void severity(MemorySegment struct, long fieldValue) {
        struct.set(severity$LAYOUT, severity$OFFSET, fieldValue);
    }

    private static final OfLong with$LAYOUT = (OfLong)$LAYOUT.select(groupElement("with"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_id_t with
     * }
     */
    public static final OfLong with$layout() {
        return with$LAYOUT;
    }

    private static final long with$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_id_t with
     * }
     */
    public static final long with$offset() {
        return with$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_id_t with
     * }
     */
    public static long with(MemorySegment struct) {
        return struct.get(with$LAYOUT, with$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_id_t with
     * }
     */
    public static void with(MemorySegment struct, long fieldValue) {
        struct.set(with$LAYOUT, with$OFFSET, fieldValue);
    }

    private static final AddressLayout var_$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("var"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *var
     * }
     */
    public static final AddressLayout var_$layout() {
        return var_$LAYOUT;
    }

    private static final long var_$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *var
     * }
     */
    public static final long var_$offset() {
        return var_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *var
     * }
     */
    public static MemorySegment var_(MemorySegment struct) {
        return struct.get(var_$LAYOUT, var_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *var
     * }
     */
    public static void var_(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(var_$LAYOUT, var_$OFFSET, fieldValue);
    }

    private static final OfInt _var_index$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_var_index"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t _var_index
     * }
     */
    public static final OfInt _var_index$layout() {
        return _var_index$LAYOUT;
    }

    private static final long _var_index$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t _var_index
     * }
     */
    public static final long _var_index$offset() {
        return _var_index$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t _var_index
     * }
     */
    public static int _var_index(MemorySegment struct) {
        return struct.get(_var_index$LAYOUT, _var_index$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t _var_index
     * }
     */
    public static void _var_index(MemorySegment struct, int fieldValue) {
        struct.set(_var_index$LAYOUT, _var_index$OFFSET, fieldValue);
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

