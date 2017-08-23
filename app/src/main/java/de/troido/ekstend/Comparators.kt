package de.troido.ekstend

import java.util.Collections

@Suppress("NOTHING_TO_INLINE")
inline fun <T> Comparator<T>.reverseOrder(): Comparator<T> =
        Collections.reverseOrder(this)
