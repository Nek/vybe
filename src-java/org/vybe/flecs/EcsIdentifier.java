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
 * struct EcsIdentifier {
 *     char *value;
 *     ecs_size_t length;
 *     uint64_t hash;
 *     uint64_t index_hash;
 *     ecs_hashmap_t *index;
 * }
 * }
 */
public class EcsIdentifier {

    EcsIdentifier() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_POINTER.withName("value"),
        flecs.C_INT.withName("length"),
        MemoryLayout.paddingLayout(4),
        flecs.C_LONG_LONG.withName("hash"),
        flecs.C_LONG_LONG.withName("index_hash"),
        flecs.C_POINTER.withName("index")
    ).withName("EcsIdentifier");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout value$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static final AddressLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.get(value$LAYOUT, value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value$LAYOUT, value$OFFSET, fieldValue);
    }

    private static final OfInt length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_size_t length
     * }
     */
    public static final OfInt length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_size_t length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_size_t length
     * }
     */
    public static int length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_size_t length
     * }
     */
    public static void length(MemorySegment struct, int fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final OfLong hash$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t hash
     * }
     */
    public static final OfLong hash$layout() {
        return hash$LAYOUT;
    }

    private static final long hash$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t hash
     * }
     */
    public static final long hash$offset() {
        return hash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t hash
     * }
     */
    public static long hash(MemorySegment struct) {
        return struct.get(hash$LAYOUT, hash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t hash
     * }
     */
    public static void hash(MemorySegment struct, long fieldValue) {
        struct.set(hash$LAYOUT, hash$OFFSET, fieldValue);
    }

    private static final OfLong index_hash$LAYOUT = (OfLong)$LAYOUT.select(groupElement("index_hash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t index_hash
     * }
     */
    public static final OfLong index_hash$layout() {
        return index_hash$LAYOUT;
    }

    private static final long index_hash$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t index_hash
     * }
     */
    public static final long index_hash$offset() {
        return index_hash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t index_hash
     * }
     */
    public static long index_hash(MemorySegment struct) {
        return struct.get(index_hash$LAYOUT, index_hash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t index_hash
     * }
     */
    public static void index_hash(MemorySegment struct, long fieldValue) {
        struct.set(index_hash$LAYOUT, index_hash$OFFSET, fieldValue);
    }

    private static final AddressLayout index$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("index"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_hashmap_t *index
     * }
     */
    public static final AddressLayout index$layout() {
        return index$LAYOUT;
    }

    private static final long index$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_hashmap_t *index
     * }
     */
    public static final long index$offset() {
        return index$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_hashmap_t *index
     * }
     */
    public static MemorySegment index(MemorySegment struct) {
        return struct.get(index$LAYOUT, index$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_hashmap_t *index
     * }
     */
    public static void index(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(index$LAYOUT, index$OFFSET, fieldValue);
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

