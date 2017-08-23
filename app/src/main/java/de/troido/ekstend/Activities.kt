package de.troido.ekstend

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified A : Activity> Context.startActivity(): Unit =
        startActivity(Intent(this, A::class.java))
