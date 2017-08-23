package de.troido.ekstend

fun <A, B, C> Pair<Pair<A, B>, C>.leftFlat(): Triple<A, B, C> =
        Triple(first.first, first.second, second)

fun <A, B, C, D> Pair<Pair<Pair<A, B>, C>, D>.leftFlat(): Tuple4<A, B, C, D> =
        Tuple4(first.first.first, first.first.second, first.second, second)

data class Tuple4<out A, out B, out C, out D>(val first: A, val second: B,
                                              val third: C, val fourth: D)
