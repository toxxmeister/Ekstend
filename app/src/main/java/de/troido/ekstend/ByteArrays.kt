package de.troido.ekstend

import android.util.Base64
import java.nio.ByteBuffer
import java.nio.ByteOrder

val EMPTY = ByteArray(0)

@Suppress("NOTHING_TO_INLINE")
inline fun Short.toByteArray(order: ByteOrder = ByteOrder.BIG_ENDIAN): ByteArray =
        ByteBuffer.allocate(2).order(order).putShort(this).array()

@Suppress("NOTHING_TO_INLINE")
inline fun Int.toByteArray(order: ByteOrder = ByteOrder.BIG_ENDIAN): ByteArray =
        ByteBuffer.allocate(4).order(order).putInt(this).array()

@Suppress("NOTHING_TO_INLINE")
inline fun Long.toByteArray(order: ByteOrder = ByteOrder.BIG_ENDIAN): ByteArray =
        ByteBuffer.allocate(8).order(order).putLong(this).array()

@Suppress("NOTHING_TO_INLINE")
inline fun Float.toByteArray(order: ByteOrder = ByteOrder.BIG_ENDIAN): ByteArray =
        ByteBuffer.allocate(4).order(order).putFloat(this).array()

@Suppress("NOTHING_TO_INLINE")
inline fun Double.toByteArray(order: ByteOrder = ByteOrder.BIG_ENDIAN): ByteArray =
        ByteBuffer.allocate(8).order(order).putDouble(this).array()

@Suppress("NOTHING_TO_INLINE")
inline fun ByteArray.toBase64(): String =
        Base64.encodeToString(this, Base64.DEFAULT)
