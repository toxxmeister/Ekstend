package de.troido.ekstend.functional.tuples

fun <A, B> tuple(
        first: A, second: B
): Pair<A, B> =
        Pair(first, second)

fun <A, B, C> tuple(
        first: A, second: B, third: C
): Triple<A, B, C> =
        Triple(first, second, third)

fun <A, B, C, D> tuple(
        first: A, second: B, third: C, fourth: D
): Tuple4<A, B, C, D> =
        Tuple4(first, second, third, fourth)

fun <A, B, C, D, E> tuple(
        first: A, second: B, third: C, fourth: D, fifth: E
): Tuple5<A, B, C, D, E> =
        Tuple5(first, second, third, fourth, fifth)

fun <A, B, C, D, E, F> tuple(
        first: A, second: B, third: C, fourth: D, fifth: E, sixth: F
): Tuple6<A, B, C, D, E, F> =
        Tuple6(first, second, third, fourth, fifth, sixth)

fun <A, B, C, D, E, F, G> tuple(
        first: A, second: B, third: C, fourth: D, fifth: E, sixth: F, seventh: G
): Tuple7<A, B, C, D, E, F, G> =
        Tuple7(first, second, third, fourth, fifth, sixth, seventh)

fun <A, B, C, D, E, F, G, H> tuple(
        first: A, second: B, third: C, fourth: D, fifth: E, sixth: F, seventh: G, eighth: H
): Tuple8<A, B, C, D, E, F, G, H> =
        Tuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)

fun <A, B, C, D, E, F, G, H, I> tuple(
        first: A, second: B, third: C, fourth: D, fifth: E, sixth: F, seventh: G, eighth: H,
        ninth: I
): Tuple9<A, B, C, D, E, F, G, H, I> =
        Tuple9(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
