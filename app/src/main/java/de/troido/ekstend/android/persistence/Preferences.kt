package de.troido.ekstend.android.persistence

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

@Suppress("NOTHING_TO_INLINE")
inline fun SharedPreferences.getStringFloat(key: String, defValue: Float = 0.0f): Float =
        getString(key, if (defValue == 0.0f) "0.0f" else defValue.toString()).toFloat()

@Suppress("NOTHING_TO_INLINE")
inline fun SharedPreferences.getStringLong(key: String, defValue: Long = 0): Long =
        getString(key, if (defValue == 0.toLong()) "0" else defValue.toString()).toLong()

@Suppress("NOTHING_TO_INLINE")
inline fun SharedPreferences.getStringInt(key: String, defValue: Int = 0): Int =
        getString(key, if (defValue == 0) "0" else defValue.toString()).toInt()

@Suppress("NOTHING_TO_INLINE")
inline fun SharedPreferences.getStringShort(key: String, defValue: Short = 0): Short =
        getString(key, if (defValue == 0.toShort()) "0" else defValue.toString()).toShort()

@Suppress("NOTHING_TO_INLINE")
inline fun SharedPreferences.getStringByte(key: String, defValue: Byte = 0): Byte =
        getString(key, if (defValue == 0.toByte()) "0" else defValue.toString()).toByte()

val Context.defaultPreferences: SharedPreferences
    get() = PreferenceManager.getDefaultSharedPreferences(this)

inline fun SharedPreferences.edit(block: SharedPreferences.Editor.() -> Unit) {
    edit().apply(block).apply()
}
