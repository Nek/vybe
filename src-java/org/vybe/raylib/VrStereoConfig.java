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
 * struct VrStereoConfig {
 *     Matrix projection[2];
 *     Matrix viewOffset[2];
 *     float leftLensCenter[2];
 *     float rightLensCenter[2];
 *     float leftScreenCenter[2];
 *     float rightScreenCenter[2];
 *     float scale[2];
 *     float scaleIn[2];
 * }
 * }
 */
public class VrStereoConfig {

    VrStereoConfig() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Matrix.layout()).withName("projection"),
        MemoryLayout.sequenceLayout(2, Matrix.layout()).withName("viewOffset"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("leftLensCenter"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("rightLensCenter"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("leftScreenCenter"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("rightScreenCenter"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("scale"),
        MemoryLayout.sequenceLayout(2, raylib.C_FLOAT).withName("scaleIn")
    ).withName("VrStereoConfig");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout projection$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("projection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static final SequenceLayout projection$layout() {
        return projection$LAYOUT;
    }

    private static final long projection$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static final long projection$offset() {
        return projection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static MemorySegment projection(MemorySegment struct) {
        return struct.asSlice(projection$OFFSET, projection$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static void projection(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, projection$OFFSET, projection$LAYOUT.byteSize());
    }

    private static long[] projection$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static long[] projection$dimensions() {
        return projection$DIMS;
    }
    private static final MethodHandle projection$ELEM_HANDLE = projection$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static MemorySegment projection(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)projection$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * Matrix projection[2]
     * }
     */
    public static void projection(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, projection(struct, index0), 0L, Matrix.layout().byteSize());
    }

    private static final SequenceLayout viewOffset$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("viewOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static final SequenceLayout viewOffset$layout() {
        return viewOffset$LAYOUT;
    }

    private static final long viewOffset$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static final long viewOffset$offset() {
        return viewOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static MemorySegment viewOffset(MemorySegment struct) {
        return struct.asSlice(viewOffset$OFFSET, viewOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static void viewOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, viewOffset$OFFSET, viewOffset$LAYOUT.byteSize());
    }

    private static long[] viewOffset$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static long[] viewOffset$dimensions() {
        return viewOffset$DIMS;
    }
    private static final MethodHandle viewOffset$ELEM_HANDLE = viewOffset$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static MemorySegment viewOffset(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)viewOffset$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * Matrix viewOffset[2]
     * }
     */
    public static void viewOffset(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, viewOffset(struct, index0), 0L, Matrix.layout().byteSize());
    }

    private static final SequenceLayout leftLensCenter$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("leftLensCenter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static final SequenceLayout leftLensCenter$layout() {
        return leftLensCenter$LAYOUT;
    }

    private static final long leftLensCenter$OFFSET = 256;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static final long leftLensCenter$offset() {
        return leftLensCenter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static MemorySegment leftLensCenter(MemorySegment struct) {
        return struct.asSlice(leftLensCenter$OFFSET, leftLensCenter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static void leftLensCenter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, leftLensCenter$OFFSET, leftLensCenter$LAYOUT.byteSize());
    }

    private static long[] leftLensCenter$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static long[] leftLensCenter$dimensions() {
        return leftLensCenter$DIMS;
    }
    private static final VarHandle leftLensCenter$ELEM_HANDLE = leftLensCenter$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static float leftLensCenter(MemorySegment struct, long index0) {
        return (float)leftLensCenter$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float leftLensCenter[2]
     * }
     */
    public static void leftLensCenter(MemorySegment struct, long index0, float fieldValue) {
        leftLensCenter$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout rightLensCenter$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rightLensCenter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static final SequenceLayout rightLensCenter$layout() {
        return rightLensCenter$LAYOUT;
    }

    private static final long rightLensCenter$OFFSET = 264;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static final long rightLensCenter$offset() {
        return rightLensCenter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static MemorySegment rightLensCenter(MemorySegment struct) {
        return struct.asSlice(rightLensCenter$OFFSET, rightLensCenter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static void rightLensCenter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rightLensCenter$OFFSET, rightLensCenter$LAYOUT.byteSize());
    }

    private static long[] rightLensCenter$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static long[] rightLensCenter$dimensions() {
        return rightLensCenter$DIMS;
    }
    private static final VarHandle rightLensCenter$ELEM_HANDLE = rightLensCenter$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static float rightLensCenter(MemorySegment struct, long index0) {
        return (float)rightLensCenter$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float rightLensCenter[2]
     * }
     */
    public static void rightLensCenter(MemorySegment struct, long index0, float fieldValue) {
        rightLensCenter$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout leftScreenCenter$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("leftScreenCenter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static final SequenceLayout leftScreenCenter$layout() {
        return leftScreenCenter$LAYOUT;
    }

    private static final long leftScreenCenter$OFFSET = 272;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static final long leftScreenCenter$offset() {
        return leftScreenCenter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static MemorySegment leftScreenCenter(MemorySegment struct) {
        return struct.asSlice(leftScreenCenter$OFFSET, leftScreenCenter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static void leftScreenCenter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, leftScreenCenter$OFFSET, leftScreenCenter$LAYOUT.byteSize());
    }

    private static long[] leftScreenCenter$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static long[] leftScreenCenter$dimensions() {
        return leftScreenCenter$DIMS;
    }
    private static final VarHandle leftScreenCenter$ELEM_HANDLE = leftScreenCenter$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static float leftScreenCenter(MemorySegment struct, long index0) {
        return (float)leftScreenCenter$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float leftScreenCenter[2]
     * }
     */
    public static void leftScreenCenter(MemorySegment struct, long index0, float fieldValue) {
        leftScreenCenter$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout rightScreenCenter$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rightScreenCenter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static final SequenceLayout rightScreenCenter$layout() {
        return rightScreenCenter$LAYOUT;
    }

    private static final long rightScreenCenter$OFFSET = 280;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static final long rightScreenCenter$offset() {
        return rightScreenCenter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static MemorySegment rightScreenCenter(MemorySegment struct) {
        return struct.asSlice(rightScreenCenter$OFFSET, rightScreenCenter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static void rightScreenCenter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rightScreenCenter$OFFSET, rightScreenCenter$LAYOUT.byteSize());
    }

    private static long[] rightScreenCenter$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static long[] rightScreenCenter$dimensions() {
        return rightScreenCenter$DIMS;
    }
    private static final VarHandle rightScreenCenter$ELEM_HANDLE = rightScreenCenter$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static float rightScreenCenter(MemorySegment struct, long index0) {
        return (float)rightScreenCenter$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float rightScreenCenter[2]
     * }
     */
    public static void rightScreenCenter(MemorySegment struct, long index0, float fieldValue) {
        rightScreenCenter$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout scale$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static final SequenceLayout scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = 288;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static final long scale$offset() {
        return scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static MemorySegment scale(MemorySegment struct) {
        return struct.asSlice(scale$OFFSET, scale$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static void scale(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scale$OFFSET, scale$LAYOUT.byteSize());
    }

    private static long[] scale$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static long[] scale$dimensions() {
        return scale$DIMS;
    }
    private static final VarHandle scale$ELEM_HANDLE = scale$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static float scale(MemorySegment struct, long index0) {
        return (float)scale$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float scale[2]
     * }
     */
    public static void scale(MemorySegment struct, long index0, float fieldValue) {
        scale$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout scaleIn$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("scaleIn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static final SequenceLayout scaleIn$layout() {
        return scaleIn$LAYOUT;
    }

    private static final long scaleIn$OFFSET = 296;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static final long scaleIn$offset() {
        return scaleIn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static MemorySegment scaleIn(MemorySegment struct) {
        return struct.asSlice(scaleIn$OFFSET, scaleIn$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static void scaleIn(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scaleIn$OFFSET, scaleIn$LAYOUT.byteSize());
    }

    private static long[] scaleIn$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static long[] scaleIn$dimensions() {
        return scaleIn$DIMS;
    }
    private static final VarHandle scaleIn$ELEM_HANDLE = scaleIn$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static float scaleIn(MemorySegment struct, long index0) {
        return (float)scaleIn$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float scaleIn[2]
     * }
     */
    public static void scaleIn(MemorySegment struct, long index0, float fieldValue) {
        scaleIn$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

