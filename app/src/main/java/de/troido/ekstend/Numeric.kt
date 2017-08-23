package de.troido.ekstend

/**
 * Applies a dead zone transformation with the given center and radius to `this` floating point
 * number.
 * This is useful for smoothing out values near some common point.
 * If `this` number is in the given radius around the center, the center is returned, otherwise
 * `this` value is returned.
 */
fun Float.deadZone(radius: Float, center: Float = 0.0f): Float = when (this) {
    in center - radius..center + radius -> center
    else                                -> this
}
