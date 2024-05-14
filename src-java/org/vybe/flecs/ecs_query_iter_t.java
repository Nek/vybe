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
 * struct ecs_query_iter_t {
 *     const ecs_query_t *query;
 *     struct ecs_var_t *vars;
 *     const struct ecs_query_var_t *query_vars;
 *     const struct ecs_query_op_t *ops;
 *     struct ecs_query_op_ctx_t *op_ctx;
 *     ecs_query_cache_table_match_t *node;
 *     ecs_query_cache_table_match_t *prev;
 *     ecs_query_cache_table_match_t *last;
 *     uint64_t *written;
 *     int32_t skip_count;
 *     ecs_query_op_profile_t *profile;
 *     int16_t op;
 *     int16_t sp;
 * }
 * }
 */
public class ecs_query_iter_t {

    ecs_query_iter_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        flecs.C_POINTER.withName("query"),
        flecs.C_POINTER.withName("vars"),
        flecs.C_POINTER.withName("query_vars"),
        flecs.C_POINTER.withName("ops"),
        flecs.C_POINTER.withName("op_ctx"),
        flecs.C_POINTER.withName("node"),
        flecs.C_POINTER.withName("prev"),
        flecs.C_POINTER.withName("last"),
        flecs.C_POINTER.withName("written"),
        flecs.C_INT.withName("skip_count"),
        MemoryLayout.paddingLayout(4),
        flecs.C_POINTER.withName("profile"),
        flecs.C_SHORT.withName("op"),
        flecs.C_SHORT.withName("sp"),
        MemoryLayout.paddingLayout(4)
    ).withName("ecs_query_iter_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout query$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const ecs_query_t *query
     * }
     */
    public static final AddressLayout query$layout() {
        return query$LAYOUT;
    }

    private static final long query$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const ecs_query_t *query
     * }
     */
    public static final long query$offset() {
        return query$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const ecs_query_t *query
     * }
     */
    public static MemorySegment query(MemorySegment struct) {
        return struct.get(query$LAYOUT, query$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const ecs_query_t *query
     * }
     */
    public static void query(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query$LAYOUT, query$OFFSET, fieldValue);
    }

    private static final AddressLayout vars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct ecs_var_t *vars
     * }
     */
    public static final AddressLayout vars$layout() {
        return vars$LAYOUT;
    }

    private static final long vars$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct ecs_var_t *vars
     * }
     */
    public static final long vars$offset() {
        return vars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct ecs_var_t *vars
     * }
     */
    public static MemorySegment vars(MemorySegment struct) {
        return struct.get(vars$LAYOUT, vars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct ecs_var_t *vars
     * }
     */
    public static void vars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vars$LAYOUT, vars$OFFSET, fieldValue);
    }

    private static final AddressLayout query_vars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query_vars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct ecs_query_var_t *query_vars
     * }
     */
    public static final AddressLayout query_vars$layout() {
        return query_vars$LAYOUT;
    }

    private static final long query_vars$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct ecs_query_var_t *query_vars
     * }
     */
    public static final long query_vars$offset() {
        return query_vars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct ecs_query_var_t *query_vars
     * }
     */
    public static MemorySegment query_vars(MemorySegment struct) {
        return struct.get(query_vars$LAYOUT, query_vars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct ecs_query_var_t *query_vars
     * }
     */
    public static void query_vars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query_vars$LAYOUT, query_vars$OFFSET, fieldValue);
    }

    private static final AddressLayout ops$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct ecs_query_op_t *ops
     * }
     */
    public static final AddressLayout ops$layout() {
        return ops$LAYOUT;
    }

    private static final long ops$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct ecs_query_op_t *ops
     * }
     */
    public static final long ops$offset() {
        return ops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct ecs_query_op_t *ops
     * }
     */
    public static MemorySegment ops(MemorySegment struct) {
        return struct.get(ops$LAYOUT, ops$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct ecs_query_op_t *ops
     * }
     */
    public static void ops(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ops$LAYOUT, ops$OFFSET, fieldValue);
    }

    private static final AddressLayout op_ctx$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("op_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct ecs_query_op_ctx_t *op_ctx
     * }
     */
    public static final AddressLayout op_ctx$layout() {
        return op_ctx$LAYOUT;
    }

    private static final long op_ctx$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct ecs_query_op_ctx_t *op_ctx
     * }
     */
    public static final long op_ctx$offset() {
        return op_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct ecs_query_op_ctx_t *op_ctx
     * }
     */
    public static MemorySegment op_ctx(MemorySegment struct) {
        return struct.get(op_ctx$LAYOUT, op_ctx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct ecs_query_op_ctx_t *op_ctx
     * }
     */
    public static void op_ctx(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(op_ctx$LAYOUT, op_ctx$OFFSET, fieldValue);
    }

    private static final AddressLayout node$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("node"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *node
     * }
     */
    public static final AddressLayout node$layout() {
        return node$LAYOUT;
    }

    private static final long node$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *node
     * }
     */
    public static final long node$offset() {
        return node$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *node
     * }
     */
    public static MemorySegment node(MemorySegment struct) {
        return struct.get(node$LAYOUT, node$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *node
     * }
     */
    public static void node(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(node$LAYOUT, node$OFFSET, fieldValue);
    }

    private static final AddressLayout prev$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("prev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *prev
     * }
     */
    public static final AddressLayout prev$layout() {
        return prev$LAYOUT;
    }

    private static final long prev$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *prev
     * }
     */
    public static final long prev$offset() {
        return prev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *prev
     * }
     */
    public static MemorySegment prev(MemorySegment struct) {
        return struct.get(prev$LAYOUT, prev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *prev
     * }
     */
    public static void prev(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prev$LAYOUT, prev$OFFSET, fieldValue);
    }

    private static final AddressLayout last$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("last"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *last
     * }
     */
    public static final AddressLayout last$layout() {
        return last$LAYOUT;
    }

    private static final long last$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *last
     * }
     */
    public static final long last$offset() {
        return last$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *last
     * }
     */
    public static MemorySegment last(MemorySegment struct) {
        return struct.get(last$LAYOUT, last$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_query_cache_table_match_t *last
     * }
     */
    public static void last(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(last$LAYOUT, last$OFFSET, fieldValue);
    }

    private static final AddressLayout written$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("written"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t *written
     * }
     */
    public static final AddressLayout written$layout() {
        return written$LAYOUT;
    }

    private static final long written$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t *written
     * }
     */
    public static final long written$offset() {
        return written$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t *written
     * }
     */
    public static MemorySegment written(MemorySegment struct) {
        return struct.get(written$LAYOUT, written$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t *written
     * }
     */
    public static void written(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(written$LAYOUT, written$OFFSET, fieldValue);
    }

    private static final OfInt skip_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("skip_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t skip_count
     * }
     */
    public static final OfInt skip_count$layout() {
        return skip_count$LAYOUT;
    }

    private static final long skip_count$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t skip_count
     * }
     */
    public static final long skip_count$offset() {
        return skip_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t skip_count
     * }
     */
    public static int skip_count(MemorySegment struct) {
        return struct.get(skip_count$LAYOUT, skip_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t skip_count
     * }
     */
    public static void skip_count(MemorySegment struct, int fieldValue) {
        struct.set(skip_count$LAYOUT, skip_count$OFFSET, fieldValue);
    }

    private static final AddressLayout profile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("profile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ecs_query_op_profile_t *profile
     * }
     */
    public static final AddressLayout profile$layout() {
        return profile$LAYOUT;
    }

    private static final long profile$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ecs_query_op_profile_t *profile
     * }
     */
    public static final long profile$offset() {
        return profile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ecs_query_op_profile_t *profile
     * }
     */
    public static MemorySegment profile(MemorySegment struct) {
        return struct.get(profile$LAYOUT, profile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ecs_query_op_profile_t *profile
     * }
     */
    public static void profile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(profile$LAYOUT, profile$OFFSET, fieldValue);
    }

    private static final OfShort op$LAYOUT = (OfShort)$LAYOUT.select(groupElement("op"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int16_t op
     * }
     */
    public static final OfShort op$layout() {
        return op$LAYOUT;
    }

    private static final long op$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int16_t op
     * }
     */
    public static final long op$offset() {
        return op$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int16_t op
     * }
     */
    public static short op(MemorySegment struct) {
        return struct.get(op$LAYOUT, op$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int16_t op
     * }
     */
    public static void op(MemorySegment struct, short fieldValue) {
        struct.set(op$LAYOUT, op$OFFSET, fieldValue);
    }

    private static final OfShort sp$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int16_t sp
     * }
     */
    public static final OfShort sp$layout() {
        return sp$LAYOUT;
    }

    private static final long sp$OFFSET = 90;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int16_t sp
     * }
     */
    public static final long sp$offset() {
        return sp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int16_t sp
     * }
     */
    public static short sp(MemorySegment struct) {
        return struct.get(sp$LAYOUT, sp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int16_t sp
     * }
     */
    public static void sp(MemorySegment struct, short fieldValue) {
        struct.set(sp$LAYOUT, sp$OFFSET, fieldValue);
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

