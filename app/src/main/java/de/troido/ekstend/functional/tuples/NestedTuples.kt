package de.troido.ekstend.functional.tuples

typealias NestedTuple3<A, B, C> =
Pair<Pair<A, B>, C>

typealias NestedTuple4<A, B, C, D> =
Pair<Pair<Pair<A, B>, C>, D>

typealias NestedTuple5<A, B, C, D, E> =
Pair<Pair<Pair<Pair<A, B>, C>, D>, E>

typealias NestedTuple6<A, B, C, D, E, F> =
Pair<Pair<Pair<Pair<Pair<A, B>, C>, D>, E>, F>

typealias NestedTuple7<A, B, C, D, E, F, G> =
Pair<Pair<Pair<Pair<Pair<Pair<A, B>, C>, D>, E>, F>, G>

typealias NestedTuple8<A, B, C, D, E, F, G, H> =
Pair<Pair<Pair<Pair<Pair<Pair<Pair<A, B>, C>, D>, E>, F>, G>, H>

typealias NestedTuple9<A, B, C, D, E, F, G, H, I> =
Pair<Pair<Pair<Pair<Pair<Pair<Pair<Pair<A, B>, C>, D>, E>, F>, G>, H>, I>

fun <A, B, C>
        NestedTuple3<A, B, C>.flat(): Triple<A, B, C> =
        tuple(first.first, first.second, second)

fun <A, B, C, D>
        NestedTuple4<A, B, C, D>.flat(): Tuple4<A, B, C, D> =
        tuple(first.first.first, first.first.second, first.second, second)

fun <A, B, C, D, E>
        NestedTuple5<A, B, C, D, E>.flat(): Tuple5<A, B, C, D, E> =
        tuple(first.first.first.first, first.first.first.second, first.first.second, first.second,
              second)

fun <A, B, C, D, E, F>
        NestedTuple6<A, B, C, D, E, F>.flat()
        : Tuple6<A, B, C, D, E, F> =
        tuple(first.first.first.first.first, first.first.first.first.second,
              first.first.first.second, first.first.second, first.second, second)

fun <A, B, C, D, E, F, G>
        NestedTuple7<A, B, C, D, E, F, G>.flat(): Tuple7<A, B, C, D, E, F, G> =
        tuple(first.first.first.first.first.first, first.first.first.first.first.second,
              first.first.first.first.second, first.first.first.second, first.first.second,
              first.second, second)

fun <A, B, C, D, E, F, G, H>
        NestedTuple8<A, B, C, D, E, F, G, H>.flat(): Tuple8<A, B, C, D, E, F, G, H> =
        tuple(first.first.first.first.first.first.first,
              first.first.first.first.first.first.second, first.first.first.first.first.second,
              first.first.first.first.second, first.first.first.second, first.first.second,
              first.second, second)

fun <A, B, C, D, E, F, G, H, I>
        NestedTuple9<A, B, C, D, E, F, G, H, I>.flat(): Tuple9<A, B, C, D, E, F, G, H, I> =
        tuple(first.first.first.first.first.first.first.first,
              first.first.first.first.first.first.first.second,
              first.first.first.first.first.first.second, first.first.first.first.first.second,
              first.first.first.first.second, first.first.first.second, first.first.second,
              first.second, second)
