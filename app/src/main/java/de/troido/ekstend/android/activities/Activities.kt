package de.troido.ekstend.android.activities

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified A : Activity> Context.startActivity() =
        startActivity(Intent(this, A::class.java))
