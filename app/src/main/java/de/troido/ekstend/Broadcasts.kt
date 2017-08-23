package de.troido.ekstend

import android.content.Context
import android.support.v4.content.LocalBroadcastManager

val Context.localBroadcastManager: LocalBroadcastManager
    get() = LocalBroadcastManager.getInstance(this)
