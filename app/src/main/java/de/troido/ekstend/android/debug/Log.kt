package de.troido.ekstend.android.debug

import android.util.Log

/** Logging function. */
typealias Logger = (msg: Any?) -> Unit

/**
 * Logs the given message to [Log.DEBUG] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logD(msg: Any?) {
    Log.d(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.DEBUG] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logD(msg: Any?, tr: Throwable) {
    Log.d(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Returns a [Log.DEBUG] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerD(tag: String): Logger =
        { Log.d(tag, it.toString()) }

/**
 * Logs the given message to [Log.INFO] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logI(msg: Any?) {
    Log.i(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.INFO] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logI(msg: Any?, tr: Throwable) {
    Log.i(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Returns a [Log.INFO] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerI(tag: String): Logger =
        { Log.i(tag, it.toString()) }

/**
 * Logs the given message to [Log.ERROR] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logE(msg: Any?) {
    Log.e(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.ERROR] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logE(msg: Any?, tr: Throwable) {
    Log.e(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Returns a [Log.ERROR] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerE(tag: String): Logger =
        { Log.e(tag, it.toString()) }

/**
 * Logs the given message to [Log.VERBOSE] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logV(msg: Any?) {
    Log.v(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.VERBOSE] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logV(msg: Any?, tr: Throwable) {
    Log.v(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Returns a [Log.VERBOSE] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerV(tag: String): Logger =
        { Log.v(tag, it.toString()) }

/**
 * Logs the given message to [Log.ASSERT] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logWtf(msg: Any?) {
    Log.wtf(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.ASSERT] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logWtf(msg: Any?, tr: Throwable) {
    Log.wtf(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Logs the given exception to [Log.ASSERT] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logWtf(tr: Throwable) {
    Log.wtf(this::class.java.simpleName, tr)
}

/**
 * Returns a [Log.ASSERT] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerWtf(tag: String): Logger =
        { Log.wtf(tag, it.toString()) }

/**
 * Logs the given message to [Log.WARN] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logW(msg: Any?) {
    Log.w(this::class.java.simpleName, msg.toString())
}

/**
 * Logs the given message to [Log.WARN] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag, and logs the given exception.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logW(msg: Any?, tr: Throwable) {
    Log.w(this::class.java.simpleName, msg.toString(), tr)
}

/**
 * Logs the given exception to [Log.WARN] output with `this` class's simple name
 * ([Class.getSimpleName]) name as a tag.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> T.logW(tr: Throwable) {
    Log.w(this::class.java.simpleName, tr)
}

/**
 * Returns a [Log.WARN] logging function with the given tag.
 * Appropriate for custom tags and functions outside of classes (such as in Kotlin).
 */
@Suppress("NOTHING_TO_INLINE")
inline fun loggerW(tag: String): Logger =
        { Log.w(tag, it.toString()) }
