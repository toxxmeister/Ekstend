package de.troido.ekstend.android.views

import android.app.Activity
import android.support.annotation.StringRes
import android.widget.Toast

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.toast(duration: Int, text: String) =
        Toast(this).run {
            this.duration = duration
            setText(text)
        }

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.shortToast(text: String) =
        toast(Toast.LENGTH_SHORT, text)

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.longToast(text: String) =
        toast(Toast.LENGTH_LONG, text)

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.toast(duration: Int, @StringRes text: Int) =
        Toast(this).run {
            this.duration = duration
            setText(text)
        }

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.shortToast(@StringRes text: Int) =
        toast(Toast.LENGTH_SHORT, text)

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.longToast(@StringRes text: Int) =
        toast(Toast.LENGTH_LONG, text)
