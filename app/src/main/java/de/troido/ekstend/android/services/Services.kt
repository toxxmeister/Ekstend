package de.troido.ekstend.android.services

import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.ServiceConnection
import de.troido.ekstend.android.intents.intent

inline fun <reified S : Service> Context.startService(): ComponentName =
        startService(intent<S>())

inline fun <reified S : Service> Context.stopService(): Boolean =
        stopService(intent<S>())

inline fun <reified S : Service> Context.bindService(conn: ServiceConnection): Boolean =
        bindService(intent<S>(), conn, 0)
