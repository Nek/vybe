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
 * typedef uint64_t (*ecs_group_by_action_t)(ecs_world_t *, ecs_table_t *, ecs_id_t, void *)
 * }
 */
public class ecs_group_by_action_t {

    ecs_group_by_action_t() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment world, MemorySegment table, long group_id, MemorySegment ctx);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        flecs.C_LONG_LONG,
        flecs.C_POINTER,
        flecs.C_POINTER,
        flecs.C_LONG_LONG,
        flecs.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = flecs.upcallHandle(ecs_group_by_action_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(ecs_group_by_action_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment world, MemorySegment table, long group_id, MemorySegment ctx) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, world, table, group_id, ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

