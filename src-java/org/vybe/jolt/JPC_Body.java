// Generated by jextract

package org.vybe.jolt;

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
 * struct JPC_Body {
 *     JPC_Real position[4];
 *     float rotation[4];
 *     float bounds_min[4];
 *     float bounds_max[4];
 *     const JPC_Shape *shape;
 *     JPC_MotionProperties *motion_properties;
 *     uint64_t user_data;
 *     JPC_CollisionGroup collision_group;
 *     float friction;
 *     float restitution;
 *     JPC_BodyID id;
 *     JPC_ObjectLayer object_layer;
 *     JPC_BroadPhaseLayer broad_phase_layer;
 *     JPC_MotionType motion_type;
 *     uint8_t flags;
 * }
 * }
 */
public class JPC_Body {

    JPC_Body() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, jolt.C_FLOAT).withName("position"),
        MemoryLayout.sequenceLayout(4, jolt.C_FLOAT).withName("rotation"),
        MemoryLayout.sequenceLayout(4, jolt.C_FLOAT).withName("bounds_min"),
        MemoryLayout.sequenceLayout(4, jolt.C_FLOAT).withName("bounds_max"),
        jolt.C_POINTER.withName("shape"),
        jolt.C_POINTER.withName("motion_properties"),
        jolt.C_LONG_LONG.withName("user_data"),
        JPC_CollisionGroup.layout().withName("collision_group"),
        jolt.C_FLOAT.withName("friction"),
        jolt.C_FLOAT.withName("restitution"),
        jolt.C_INT.withName("id"),
        jolt.C_SHORT.withName("object_layer"),
        jolt.C_CHAR.withName("broad_phase_layer"),
        jolt.C_CHAR.withName("motion_type"),
        jolt.C_CHAR.withName("flags"),
        MemoryLayout.paddingLayout(7)
    ).withName("JPC_Body");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout position$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static final SequenceLayout position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static MemorySegment position(MemorySegment struct) {
        return struct.asSlice(position$OFFSET, position$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static void position(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, position$OFFSET, position$LAYOUT.byteSize());
    }

    private static long[] position$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static long[] position$dimensions() {
        return position$DIMS;
    }
    private static final VarHandle position$ELEM_HANDLE = position$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static float position(MemorySegment struct, long index0) {
        return (float)position$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * JPC_Real position[4]
     * }
     */
    public static void position(MemorySegment struct, long index0, float fieldValue) {
        position$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout rotation$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rotation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static final SequenceLayout rotation$layout() {
        return rotation$LAYOUT;
    }

    private static final long rotation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static final long rotation$offset() {
        return rotation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static MemorySegment rotation(MemorySegment struct) {
        return struct.asSlice(rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static void rotation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    private static long[] rotation$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static long[] rotation$dimensions() {
        return rotation$DIMS;
    }
    private static final VarHandle rotation$ELEM_HANDLE = rotation$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static float rotation(MemorySegment struct, long index0) {
        return (float)rotation$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float rotation[4]
     * }
     */
    public static void rotation(MemorySegment struct, long index0, float fieldValue) {
        rotation$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout bounds_min$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bounds_min"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static final SequenceLayout bounds_min$layout() {
        return bounds_min$LAYOUT;
    }

    private static final long bounds_min$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static final long bounds_min$offset() {
        return bounds_min$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static MemorySegment bounds_min(MemorySegment struct) {
        return struct.asSlice(bounds_min$OFFSET, bounds_min$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static void bounds_min(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bounds_min$OFFSET, bounds_min$LAYOUT.byteSize());
    }

    private static long[] bounds_min$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static long[] bounds_min$dimensions() {
        return bounds_min$DIMS;
    }
    private static final VarHandle bounds_min$ELEM_HANDLE = bounds_min$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static float bounds_min(MemorySegment struct, long index0) {
        return (float)bounds_min$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float bounds_min[4]
     * }
     */
    public static void bounds_min(MemorySegment struct, long index0, float fieldValue) {
        bounds_min$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout bounds_max$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bounds_max"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static final SequenceLayout bounds_max$layout() {
        return bounds_max$LAYOUT;
    }

    private static final long bounds_max$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static final long bounds_max$offset() {
        return bounds_max$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static MemorySegment bounds_max(MemorySegment struct) {
        return struct.asSlice(bounds_max$OFFSET, bounds_max$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static void bounds_max(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bounds_max$OFFSET, bounds_max$LAYOUT.byteSize());
    }

    private static long[] bounds_max$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static long[] bounds_max$dimensions() {
        return bounds_max$DIMS;
    }
    private static final VarHandle bounds_max$ELEM_HANDLE = bounds_max$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static float bounds_max(MemorySegment struct, long index0) {
        return (float)bounds_max$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float bounds_max[4]
     * }
     */
    public static void bounds_max(MemorySegment struct, long index0, float fieldValue) {
        bounds_max$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout shape$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("shape"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const JPC_Shape *shape
     * }
     */
    public static final AddressLayout shape$layout() {
        return shape$LAYOUT;
    }

    private static final long shape$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const JPC_Shape *shape
     * }
     */
    public static final long shape$offset() {
        return shape$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const JPC_Shape *shape
     * }
     */
    public static MemorySegment shape(MemorySegment struct) {
        return struct.get(shape$LAYOUT, shape$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const JPC_Shape *shape
     * }
     */
    public static void shape(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(shape$LAYOUT, shape$OFFSET, fieldValue);
    }

    private static final AddressLayout motion_properties$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("motion_properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_MotionProperties *motion_properties
     * }
     */
    public static final AddressLayout motion_properties$layout() {
        return motion_properties$LAYOUT;
    }

    private static final long motion_properties$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_MotionProperties *motion_properties
     * }
     */
    public static final long motion_properties$offset() {
        return motion_properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_MotionProperties *motion_properties
     * }
     */
    public static MemorySegment motion_properties(MemorySegment struct) {
        return struct.get(motion_properties$LAYOUT, motion_properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_MotionProperties *motion_properties
     * }
     */
    public static void motion_properties(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(motion_properties$LAYOUT, motion_properties$OFFSET, fieldValue);
    }

    private static final OfLong user_data$LAYOUT = (OfLong)$LAYOUT.select(groupElement("user_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t user_data
     * }
     */
    public static final OfLong user_data$layout() {
        return user_data$LAYOUT;
    }

    private static final long user_data$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t user_data
     * }
     */
    public static final long user_data$offset() {
        return user_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t user_data
     * }
     */
    public static long user_data(MemorySegment struct) {
        return struct.get(user_data$LAYOUT, user_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t user_data
     * }
     */
    public static void user_data(MemorySegment struct, long fieldValue) {
        struct.set(user_data$LAYOUT, user_data$OFFSET, fieldValue);
    }

    private static final GroupLayout collision_group$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("collision_group"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_CollisionGroup collision_group
     * }
     */
    public static final GroupLayout collision_group$layout() {
        return collision_group$LAYOUT;
    }

    private static final long collision_group$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_CollisionGroup collision_group
     * }
     */
    public static final long collision_group$offset() {
        return collision_group$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_CollisionGroup collision_group
     * }
     */
    public static MemorySegment collision_group(MemorySegment struct) {
        return struct.asSlice(collision_group$OFFSET, collision_group$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_CollisionGroup collision_group
     * }
     */
    public static void collision_group(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, collision_group$OFFSET, collision_group$LAYOUT.byteSize());
    }

    private static final OfFloat friction$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("friction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float friction
     * }
     */
    public static final OfFloat friction$layout() {
        return friction$LAYOUT;
    }

    private static final long friction$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float friction
     * }
     */
    public static final long friction$offset() {
        return friction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float friction
     * }
     */
    public static float friction(MemorySegment struct) {
        return struct.get(friction$LAYOUT, friction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float friction
     * }
     */
    public static void friction(MemorySegment struct, float fieldValue) {
        struct.set(friction$LAYOUT, friction$OFFSET, fieldValue);
    }

    private static final OfFloat restitution$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("restitution"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float restitution
     * }
     */
    public static final OfFloat restitution$layout() {
        return restitution$LAYOUT;
    }

    private static final long restitution$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float restitution
     * }
     */
    public static final long restitution$offset() {
        return restitution$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float restitution
     * }
     */
    public static float restitution(MemorySegment struct) {
        return struct.get(restitution$LAYOUT, restitution$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float restitution
     * }
     */
    public static void restitution(MemorySegment struct, float fieldValue) {
        struct.set(restitution$LAYOUT, restitution$OFFSET, fieldValue);
    }

    private static final OfInt id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_BodyID id
     * }
     */
    public static final OfInt id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_BodyID id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_BodyID id
     * }
     */
    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_BodyID id
     * }
     */
    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final OfShort object_layer$LAYOUT = (OfShort)$LAYOUT.select(groupElement("object_layer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_ObjectLayer object_layer
     * }
     */
    public static final OfShort object_layer$layout() {
        return object_layer$LAYOUT;
    }

    private static final long object_layer$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_ObjectLayer object_layer
     * }
     */
    public static final long object_layer$offset() {
        return object_layer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_ObjectLayer object_layer
     * }
     */
    public static short object_layer(MemorySegment struct) {
        return struct.get(object_layer$LAYOUT, object_layer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_ObjectLayer object_layer
     * }
     */
    public static void object_layer(MemorySegment struct, short fieldValue) {
        struct.set(object_layer$LAYOUT, object_layer$OFFSET, fieldValue);
    }

    private static final OfByte broad_phase_layer$LAYOUT = (OfByte)$LAYOUT.select(groupElement("broad_phase_layer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_BroadPhaseLayer broad_phase_layer
     * }
     */
    public static final OfByte broad_phase_layer$layout() {
        return broad_phase_layer$LAYOUT;
    }

    private static final long broad_phase_layer$OFFSET = 118;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_BroadPhaseLayer broad_phase_layer
     * }
     */
    public static final long broad_phase_layer$offset() {
        return broad_phase_layer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_BroadPhaseLayer broad_phase_layer
     * }
     */
    public static byte broad_phase_layer(MemorySegment struct) {
        return struct.get(broad_phase_layer$LAYOUT, broad_phase_layer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_BroadPhaseLayer broad_phase_layer
     * }
     */
    public static void broad_phase_layer(MemorySegment struct, byte fieldValue) {
        struct.set(broad_phase_layer$LAYOUT, broad_phase_layer$OFFSET, fieldValue);
    }

    private static final OfByte motion_type$LAYOUT = (OfByte)$LAYOUT.select(groupElement("motion_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JPC_MotionType motion_type
     * }
     */
    public static final OfByte motion_type$layout() {
        return motion_type$LAYOUT;
    }

    private static final long motion_type$OFFSET = 119;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JPC_MotionType motion_type
     * }
     */
    public static final long motion_type$offset() {
        return motion_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JPC_MotionType motion_type
     * }
     */
    public static byte motion_type(MemorySegment struct) {
        return struct.get(motion_type$LAYOUT, motion_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JPC_MotionType motion_type
     * }
     */
    public static void motion_type(MemorySegment struct, byte fieldValue) {
        struct.set(motion_type$LAYOUT, motion_type$OFFSET, fieldValue);
    }

    private static final OfByte flags$LAYOUT = (OfByte)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t flags
     * }
     */
    public static final OfByte flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t flags
     * }
     */
    public static byte flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t flags
     * }
     */
    public static void flags(MemorySegment struct, byte fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

