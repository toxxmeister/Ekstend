package de.troido.ekstend

import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection

inline fun <reified S : Service> Context.startService(): ComponentName =
        startService(Intent(this, S::class.java))

inline fun <reified S : Service> Context.stopService(): Boolean =
        stopService(Intent(this, S::class.java))

inline fun <reified S : Service> Context.bindService(conn: ServiceConnection): Boolean =
        bindService(Intent(this, S::class.java), conn, 0)
