package de.troido.ekstend.android.encoding

import android.util.Base64

@Suppress("NOTHING_TO_INLINE")
inline fun ByteArray.toBase64(): String =
        Base64.encodeToString(this, Base64.DEFAULT)
