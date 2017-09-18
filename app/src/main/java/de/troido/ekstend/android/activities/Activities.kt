package de.troido.ekstend.android.activities

import android.app.Activity
import android.content.Context
import de.troido.ekstend.android.intents.intent

inline fun <reified A : Activity> Context.startActivity() =
        startActivity(intent<A>())
