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
 * struct ecs_header_t {
 *     int32_t magic;
 *     int32_t type;
 *     int32_t refcount;
 *     ecs_mixins_t *mixins;
 * }
 * }
 */
public class ecs_header_t {

    ecs_header_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_INT.withName("magic"),
        flecs.C_INT.withName("type"),
        flecs.C_INT.withName("refcount"),
        MemoryLayout.paddingLayout(4),
        flecs.C_POINTER.withName("mixins")
    ).withName("ecs_header_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t magic
     * }
     */
    public static final OfInt magic$layout() {
        return magic$LAYOUT;
    }

    private static final long magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t magic
     * }
     */
    public static final long magic$offset() {
        return magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t magic
     * }
     */
    public static int magic(MemorySegment struct) {
        return struct.get(magic$LAYOUT, magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t magic
     * }
     */
    public static void magic(MemorySegment struct, int fieldValue) {
        struct.set(magic$LAYOUT, magic$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt refcount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("refcount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t refcount
     * }
     */
    public static final OfInt refcount$layout() {
        return refcount$LAYOUT;
    }

    private static final long refcount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t refcount
     * }
     */
    public static final long refcount$offset() {
        return refcount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t refcount
     * }
     */
    public static int refcount(MemorySegment struct) {
        return struct.get(refcount$LAYOUT, refcount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t refcount
     * }
     */
    public static void refcount(MemorySegment struct, int fieldValue) {
        struct.set(refcount$LAYOUT, refcount$OFFSET, fieldValue);
    }

    private static final AddressLayout mixins$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mixins"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_mixins_t *mixins
     * }
     */
    public static final AddressLayout mixins$layout() {
        return mixins$LAYOUT;
    }

    private static final long mixins$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_mixins_t *mixins
     * }
     */
    public static final long mixins$offset() {
        return mixins$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_mixins_t *mixins
     * }
     */
    public static MemorySegment mixins(MemorySegment struct) {
        return struct.get(mixins$LAYOUT, mixins$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_mixins_t *mixins
     * }
     */
    public static void mixins(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mixins$LAYOUT, mixins$OFFSET, fieldValue);
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

