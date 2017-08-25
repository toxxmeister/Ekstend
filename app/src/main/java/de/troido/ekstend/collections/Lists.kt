package de.troido.ekstend.collections

/**
 * Returns the first element which is an instance of [U] in `this` list of [T]s, where [U] is a
 * subclass of [T], otherwise returns `null`.
 */
inline fun <T, reified U : T> List<T>.firstInstance(): U? =
        firstOrNull { it is U } as U
