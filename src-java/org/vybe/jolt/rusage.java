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
 * struct rusage {
 *     struct timeval ru_utime;
 *     struct timeval ru_stime;
 *     long ru_maxrss;
 *     long ru_ixrss;
 *     long ru_idrss;
 *     long ru_isrss;
 *     long ru_minflt;
 *     long ru_majflt;
 *     long ru_nswap;
 *     long ru_inblock;
 *     long ru_oublock;
 *     long ru_msgsnd;
 *     long ru_msgrcv;
 *     long ru_nsignals;
 *     long ru_nvcsw;
 *     long ru_nivcsw;
 * }
 * }
 */
public class rusage {

    rusage() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        timeval.layout().withName("ru_utime"),
        timeval.layout().withName("ru_stime"),
        jolt.C_LONG.withName("ru_maxrss"),
        jolt.C_LONG.withName("ru_ixrss"),
        jolt.C_LONG.withName("ru_idrss"),
        jolt.C_LONG.withName("ru_isrss"),
        jolt.C_LONG.withName("ru_minflt"),
        jolt.C_LONG.withName("ru_majflt"),
        jolt.C_LONG.withName("ru_nswap"),
        jolt.C_LONG.withName("ru_inblock"),
        jolt.C_LONG.withName("ru_oublock"),
        jolt.C_LONG.withName("ru_msgsnd"),
        jolt.C_LONG.withName("ru_msgrcv"),
        jolt.C_LONG.withName("ru_nsignals"),
        jolt.C_LONG.withName("ru_nvcsw"),
        jolt.C_LONG.withName("ru_nivcsw")
    ).withName("rusage");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ru_utime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ru_utime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval ru_utime
     * }
     */
    public static final GroupLayout ru_utime$layout() {
        return ru_utime$LAYOUT;
    }

    private static final long ru_utime$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval ru_utime
     * }
     */
    public static final long ru_utime$offset() {
        return ru_utime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval ru_utime
     * }
     */
    public static MemorySegment ru_utime(MemorySegment struct) {
        return struct.asSlice(ru_utime$OFFSET, ru_utime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval ru_utime
     * }
     */
    public static void ru_utime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ru_utime$OFFSET, ru_utime$LAYOUT.byteSize());
    }

    private static final GroupLayout ru_stime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ru_stime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval ru_stime
     * }
     */
    public static final GroupLayout ru_stime$layout() {
        return ru_stime$LAYOUT;
    }

    private static final long ru_stime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval ru_stime
     * }
     */
    public static final long ru_stime$offset() {
        return ru_stime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval ru_stime
     * }
     */
    public static MemorySegment ru_stime(MemorySegment struct) {
        return struct.asSlice(ru_stime$OFFSET, ru_stime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval ru_stime
     * }
     */
    public static void ru_stime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ru_stime$OFFSET, ru_stime$LAYOUT.byteSize());
    }

    private static final OfLong ru_maxrss$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_maxrss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_maxrss
     * }
     */
    public static final OfLong ru_maxrss$layout() {
        return ru_maxrss$LAYOUT;
    }

    private static final long ru_maxrss$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_maxrss
     * }
     */
    public static final long ru_maxrss$offset() {
        return ru_maxrss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_maxrss
     * }
     */
    public static long ru_maxrss(MemorySegment struct) {
        return struct.get(ru_maxrss$LAYOUT, ru_maxrss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_maxrss
     * }
     */
    public static void ru_maxrss(MemorySegment struct, long fieldValue) {
        struct.set(ru_maxrss$LAYOUT, ru_maxrss$OFFSET, fieldValue);
    }

    private static final OfLong ru_ixrss$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_ixrss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_ixrss
     * }
     */
    public static final OfLong ru_ixrss$layout() {
        return ru_ixrss$LAYOUT;
    }

    private static final long ru_ixrss$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_ixrss
     * }
     */
    public static final long ru_ixrss$offset() {
        return ru_ixrss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_ixrss
     * }
     */
    public static long ru_ixrss(MemorySegment struct) {
        return struct.get(ru_ixrss$LAYOUT, ru_ixrss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_ixrss
     * }
     */
    public static void ru_ixrss(MemorySegment struct, long fieldValue) {
        struct.set(ru_ixrss$LAYOUT, ru_ixrss$OFFSET, fieldValue);
    }

    private static final OfLong ru_idrss$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_idrss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_idrss
     * }
     */
    public static final OfLong ru_idrss$layout() {
        return ru_idrss$LAYOUT;
    }

    private static final long ru_idrss$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_idrss
     * }
     */
    public static final long ru_idrss$offset() {
        return ru_idrss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_idrss
     * }
     */
    public static long ru_idrss(MemorySegment struct) {
        return struct.get(ru_idrss$LAYOUT, ru_idrss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_idrss
     * }
     */
    public static void ru_idrss(MemorySegment struct, long fieldValue) {
        struct.set(ru_idrss$LAYOUT, ru_idrss$OFFSET, fieldValue);
    }

    private static final OfLong ru_isrss$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_isrss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_isrss
     * }
     */
    public static final OfLong ru_isrss$layout() {
        return ru_isrss$LAYOUT;
    }

    private static final long ru_isrss$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_isrss
     * }
     */
    public static final long ru_isrss$offset() {
        return ru_isrss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_isrss
     * }
     */
    public static long ru_isrss(MemorySegment struct) {
        return struct.get(ru_isrss$LAYOUT, ru_isrss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_isrss
     * }
     */
    public static void ru_isrss(MemorySegment struct, long fieldValue) {
        struct.set(ru_isrss$LAYOUT, ru_isrss$OFFSET, fieldValue);
    }

    private static final OfLong ru_minflt$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_minflt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_minflt
     * }
     */
    public static final OfLong ru_minflt$layout() {
        return ru_minflt$LAYOUT;
    }

    private static final long ru_minflt$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_minflt
     * }
     */
    public static final long ru_minflt$offset() {
        return ru_minflt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_minflt
     * }
     */
    public static long ru_minflt(MemorySegment struct) {
        return struct.get(ru_minflt$LAYOUT, ru_minflt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_minflt
     * }
     */
    public static void ru_minflt(MemorySegment struct, long fieldValue) {
        struct.set(ru_minflt$LAYOUT, ru_minflt$OFFSET, fieldValue);
    }

    private static final OfLong ru_majflt$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_majflt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_majflt
     * }
     */
    public static final OfLong ru_majflt$layout() {
        return ru_majflt$LAYOUT;
    }

    private static final long ru_majflt$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_majflt
     * }
     */
    public static final long ru_majflt$offset() {
        return ru_majflt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_majflt
     * }
     */
    public static long ru_majflt(MemorySegment struct) {
        return struct.get(ru_majflt$LAYOUT, ru_majflt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_majflt
     * }
     */
    public static void ru_majflt(MemorySegment struct, long fieldValue) {
        struct.set(ru_majflt$LAYOUT, ru_majflt$OFFSET, fieldValue);
    }

    private static final OfLong ru_nswap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_nswap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_nswap
     * }
     */
    public static final OfLong ru_nswap$layout() {
        return ru_nswap$LAYOUT;
    }

    private static final long ru_nswap$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_nswap
     * }
     */
    public static final long ru_nswap$offset() {
        return ru_nswap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_nswap
     * }
     */
    public static long ru_nswap(MemorySegment struct) {
        return struct.get(ru_nswap$LAYOUT, ru_nswap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_nswap
     * }
     */
    public static void ru_nswap(MemorySegment struct, long fieldValue) {
        struct.set(ru_nswap$LAYOUT, ru_nswap$OFFSET, fieldValue);
    }

    private static final OfLong ru_inblock$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_inblock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_inblock
     * }
     */
    public static final OfLong ru_inblock$layout() {
        return ru_inblock$LAYOUT;
    }

    private static final long ru_inblock$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_inblock
     * }
     */
    public static final long ru_inblock$offset() {
        return ru_inblock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_inblock
     * }
     */
    public static long ru_inblock(MemorySegment struct) {
        return struct.get(ru_inblock$LAYOUT, ru_inblock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_inblock
     * }
     */
    public static void ru_inblock(MemorySegment struct, long fieldValue) {
        struct.set(ru_inblock$LAYOUT, ru_inblock$OFFSET, fieldValue);
    }

    private static final OfLong ru_oublock$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_oublock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_oublock
     * }
     */
    public static final OfLong ru_oublock$layout() {
        return ru_oublock$LAYOUT;
    }

    private static final long ru_oublock$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_oublock
     * }
     */
    public static final long ru_oublock$offset() {
        return ru_oublock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_oublock
     * }
     */
    public static long ru_oublock(MemorySegment struct) {
        return struct.get(ru_oublock$LAYOUT, ru_oublock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_oublock
     * }
     */
    public static void ru_oublock(MemorySegment struct, long fieldValue) {
        struct.set(ru_oublock$LAYOUT, ru_oublock$OFFSET, fieldValue);
    }

    private static final OfLong ru_msgsnd$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_msgsnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_msgsnd
     * }
     */
    public static final OfLong ru_msgsnd$layout() {
        return ru_msgsnd$LAYOUT;
    }

    private static final long ru_msgsnd$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_msgsnd
     * }
     */
    public static final long ru_msgsnd$offset() {
        return ru_msgsnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_msgsnd
     * }
     */
    public static long ru_msgsnd(MemorySegment struct) {
        return struct.get(ru_msgsnd$LAYOUT, ru_msgsnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_msgsnd
     * }
     */
    public static void ru_msgsnd(MemorySegment struct, long fieldValue) {
        struct.set(ru_msgsnd$LAYOUT, ru_msgsnd$OFFSET, fieldValue);
    }

    private static final OfLong ru_msgrcv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_msgrcv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_msgrcv
     * }
     */
    public static final OfLong ru_msgrcv$layout() {
        return ru_msgrcv$LAYOUT;
    }

    private static final long ru_msgrcv$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_msgrcv
     * }
     */
    public static final long ru_msgrcv$offset() {
        return ru_msgrcv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_msgrcv
     * }
     */
    public static long ru_msgrcv(MemorySegment struct) {
        return struct.get(ru_msgrcv$LAYOUT, ru_msgrcv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_msgrcv
     * }
     */
    public static void ru_msgrcv(MemorySegment struct, long fieldValue) {
        struct.set(ru_msgrcv$LAYOUT, ru_msgrcv$OFFSET, fieldValue);
    }

    private static final OfLong ru_nsignals$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_nsignals"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_nsignals
     * }
     */
    public static final OfLong ru_nsignals$layout() {
        return ru_nsignals$LAYOUT;
    }

    private static final long ru_nsignals$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_nsignals
     * }
     */
    public static final long ru_nsignals$offset() {
        return ru_nsignals$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_nsignals
     * }
     */
    public static long ru_nsignals(MemorySegment struct) {
        return struct.get(ru_nsignals$LAYOUT, ru_nsignals$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_nsignals
     * }
     */
    public static void ru_nsignals(MemorySegment struct, long fieldValue) {
        struct.set(ru_nsignals$LAYOUT, ru_nsignals$OFFSET, fieldValue);
    }

    private static final OfLong ru_nvcsw$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_nvcsw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_nvcsw
     * }
     */
    public static final OfLong ru_nvcsw$layout() {
        return ru_nvcsw$LAYOUT;
    }

    private static final long ru_nvcsw$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_nvcsw
     * }
     */
    public static final long ru_nvcsw$offset() {
        return ru_nvcsw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_nvcsw
     * }
     */
    public static long ru_nvcsw(MemorySegment struct) {
        return struct.get(ru_nvcsw$LAYOUT, ru_nvcsw$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_nvcsw
     * }
     */
    public static void ru_nvcsw(MemorySegment struct, long fieldValue) {
        struct.set(ru_nvcsw$LAYOUT, ru_nvcsw$OFFSET, fieldValue);
    }

    private static final OfLong ru_nivcsw$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ru_nivcsw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long ru_nivcsw
     * }
     */
    public static final OfLong ru_nivcsw$layout() {
        return ru_nivcsw$LAYOUT;
    }

    private static final long ru_nivcsw$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long ru_nivcsw
     * }
     */
    public static final long ru_nivcsw$offset() {
        return ru_nivcsw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long ru_nivcsw
     * }
     */
    public static long ru_nivcsw(MemorySegment struct) {
        return struct.get(ru_nivcsw$LAYOUT, ru_nivcsw$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long ru_nivcsw
     * }
     */
    public static void ru_nivcsw(MemorySegment struct, long fieldValue) {
        struct.set(ru_nivcsw$LAYOUT, ru_nivcsw$OFFSET, fieldValue);
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

