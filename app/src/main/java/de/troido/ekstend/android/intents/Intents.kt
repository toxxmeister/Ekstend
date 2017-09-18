package de.troido.ekstend.android.intents

import android.content.Context
import android.content.Intent
import android.net.Uri

inline fun <reified T : Context> Context.intent(
        action: String? = null,
        uri: Uri? = null,
        intentBlock: Intent.() -> Unit
): Intent =
        when {
            action != null && uri != null -> Intent(action, uri,
                                                    this, T::class.java)
            else                          -> Intent(this, T::class.java)
        }.apply(intentBlock)

inline fun <reified T : Context> Context.intent(
        action: String? = null,
        uri: Uri? = null
): Intent =
        intent<T>(action, uri) {}
