// Generated by jextract

package org.vybe.raylib;

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
 * struct Transform {
 *     Vector3 translation;
 *     Quaternion rotation;
 *     Vector3 scale;
 * }
 * }
 */
public class Transform {

    Transform() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Vector3.layout().withName("translation"),
        Vector4.layout().withName("rotation"),
        Vector3.layout().withName("scale")
    ).withName("Transform");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout translation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("translation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Vector3 translation
     * }
     */
    public static final GroupLayout translation$layout() {
        return translation$LAYOUT;
    }

    private static final long translation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Vector3 translation
     * }
     */
    public static final long translation$offset() {
        return translation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Vector3 translation
     * }
     */
    public static MemorySegment translation(MemorySegment struct) {
        return struct.asSlice(translation$OFFSET, translation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Vector3 translation
     * }
     */
    public static void translation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, translation$OFFSET, translation$LAYOUT.byteSize());
    }

    private static final GroupLayout rotation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rotation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Quaternion rotation
     * }
     */
    public static final GroupLayout rotation$layout() {
        return rotation$LAYOUT;
    }

    private static final long rotation$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Quaternion rotation
     * }
     */
    public static final long rotation$offset() {
        return rotation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Quaternion rotation
     * }
     */
    public static MemorySegment rotation(MemorySegment struct) {
        return struct.asSlice(rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Quaternion rotation
     * }
     */
    public static void rotation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    private static final GroupLayout scale$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Vector3 scale
     * }
     */
    public static final GroupLayout scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Vector3 scale
     * }
     */
    public static final long scale$offset() {
        return scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Vector3 scale
     * }
     */
    public static MemorySegment scale(MemorySegment struct) {
        return struct.asSlice(scale$OFFSET, scale$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Vector3 scale
     * }
     */
    public static void scale(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scale$OFFSET, scale$LAYOUT.byteSize());
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

