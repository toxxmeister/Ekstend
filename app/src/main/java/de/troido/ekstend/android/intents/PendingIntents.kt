package de.troido.ekstend.android.intents

import android.app.Activity
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri

inline fun <reified T : Activity> Context.activityIntent(
        requestCode: Int = 0,
        flags: Int = PendingIntent.FLAG_ONE_SHOT,
        action: String? = null,
        uri: Uri? = null,
        intentBlock: Intent.() -> Unit
): PendingIntent =
        PendingIntent.getActivity(
                this,
                requestCode,
                intent<T>(action, uri, intentBlock),
                flags
        )

inline fun <reified T : Activity> Context.activityIntent(
        requestCode: Int = 0,
        flags: Int = PendingIntent.FLAG_ONE_SHOT,
        action: String? = null,
        uri: Uri? = null
): PendingIntent =
        activityIntent<T>(requestCode, flags, action, uri) {}
