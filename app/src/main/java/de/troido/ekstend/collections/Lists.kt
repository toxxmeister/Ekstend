package de.troido.ekstend.collections

/**
 * Returns the first element which is an instance of [U] in `this` list of [T]s, where [U] is a
 * subclass of [T], otherwise returns `null`.
 */
inline fun <T, reified U : T> List<T>.firstInstance(): U? =
        firstOrNull { it is U } as U

@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> List<T>.component6(): T =
        get(5)

@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> List<T>.component7(): T =
        get(6)

@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> List<T>.component8(): T =
        get(7)

@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> List<T>.component9(): T =
        get(8)
