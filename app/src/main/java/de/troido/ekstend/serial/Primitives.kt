package de.troido.ekstend.serial

import java.nio.ByteBuffer
import java.nio.ByteOrder

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
