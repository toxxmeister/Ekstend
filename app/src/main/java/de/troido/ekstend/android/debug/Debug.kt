package de.troido.ekstend.android.debug

import de.troido.ekstend.BuildConfig

/**
 * A debug build-gated block, the given block will be executed only if [BuildConfig.DEBUG] is
 * `true`, i.e. the current build is a debug build.
 *
 * Example usage:
 * ```
 * debug {
 *     Log.d("SomeTag", "I will only be logged in a debug build!")
 * }
 * ```
 */
inline fun debug(block: () -> Unit) =
        if (BuildConfig.DEBUG) block() else Unit
