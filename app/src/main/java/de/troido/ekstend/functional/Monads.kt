package de.troido.ekstend.functional

/**
 * Given a [List]`<T?>` returns a [List]`<T>` if no elements are `null`, otherwise returns `null`.
 */
@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T> List<T?>.joinNull(): List<T>? =
        if (any { it == null }) null else this as List<T>

/**
 * Monadic fold over Kotlin's nullable types.
 *
 * Returns the value of folding the values of `this` array using the given function [f]
 * (just like [kotlin.collections.ArrayAsCollection.fold]`<`[A]`, `[B]`>`) if at every step
 * the folding function returns a non-`null` value.
 * Otherwise, returns `null` if at any step the folding function [f] returns `null`.
 */
inline fun <A, B> Array<A>.foldM(initial: B, f: (B, A) -> B?): B? {
    var accum: B? = initial
    for (x in this) {
        if (accum == null) break
        accum = f(accum, x)
    }
    return accum
}

/**
 * Returns a [List]`<`[T]`>` if no elements of `this` ([List]`<`[T?]`>`) are `null`, otherwise
 * returns `null`.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> List<T?>.sequence(): List<T>? =
        if (any { it == null }) null else mapNotNull { it }
