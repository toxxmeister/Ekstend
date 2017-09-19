package de.troido.ekstend.android.application

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.support.annotation.DrawableRes

private val Context.appInfo: ApplicationInfo
    get() = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)

val Context.defaultAppIcon: Int
    @DrawableRes get() = appInfo.icon

val Context.applicationName: String
    get() = packageManager.getApplicationLabel(appInfo).toString()
