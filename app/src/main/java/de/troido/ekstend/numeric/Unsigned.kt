package de.troido.ekstend.numeric

import kotlin.experimental.and

@Suppress("NOTHING_TO_INLINE")
inline fun Byte.toUByte(): Short = toShort() and 0xff

@Suppress("NOTHING_TO_INLINE")
inline fun Byte.toUShort(): Int = toInt() and 0xff

@Suppress("NOTHING_TO_INLINE")
inline fun Byte.toUInt(): Long = toLong() and 0xff

@Suppress("NOTHING_TO_INLINE")
inline fun Short.toUShort(): Int = toInt() and 0xffff

@Suppress("NOTHING_TO_INLINE")
inline fun Short.toUInt(): Long = toLong() and 0xffff

@Suppress("NOTHING_TO_INLINE")
inline fun Int.toUInt(): Long = toLong() and 0xffffffff
