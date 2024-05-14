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
 * typedef struct __sFILE {
 *     unsigned char *_p;
 *     int _r;
 *     int _w;
 *     short _flags;
 *     short _file;
 *     struct __sbuf _bf;
 *     int _lbfsize;
 *     void *_cookie;
 *     int (* _Nullable _close)(void *);
 *     int (* _Nullable _read)(void *, char *, int);
 *     fpos_t (* _Nullable _seek)(void *, fpos_t, int);
 *     int (* _Nullable _write)(void *, const char *, int);
 *     struct __sbuf _ub;
 *     struct __sFILEX *_extra;
 *     int _ur;
 *     unsigned char _ubuf[3];
 *     unsigned char _nbuf[1];
 *     struct __sbuf _lb;
 *     int _blksize;
 *     fpos_t _offset;
 * } FILE
 * }
 */
public class FILE extends __sFILE {

    FILE() {
        // Should not be called directly
    }
}

