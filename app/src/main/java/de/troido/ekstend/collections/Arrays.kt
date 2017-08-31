package de.troido.ekstend.collections

@Suppress("NOTHING_TO_INLINE")
inline fun <T> Array<T>.copyOfRange(from: Int): Array<T> =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun BooleanArray.copyOfRange(from: Int): BooleanArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun CharArray.copyOfRange(from: Int): CharArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun ByteArray.copyOfRange(from: Int): ByteArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun ShortArray.copyOfRange(from: Int): ShortArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun IntArray.copyOfRange(from: Int): IntArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun LongArray.copyOfRange(from: Int): LongArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun FloatArray.copyOfRange(from: Int): FloatArray =
        copyOfRange(from, size)

@Suppress("NOTHING_TO_INLINE")
inline fun DoubleArray.copyOfRange(from: Int): DoubleArray =
        copyOfRange(from, size)
