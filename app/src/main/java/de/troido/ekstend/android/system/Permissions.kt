package de.troido.ekstend.android.system

import android.app.Activity
import android.content.pm.PackageManager
import android.support.annotation.StringRes
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import de.troido.ekstend.android.views.longToast

@Suppress("NOTHING_TO_INLINE")
inline fun Activity.checkPermission(permission: String): Boolean =
        ContextCompat.checkSelfPermission(this, permission) ==
                PackageManager.PERMISSION_GRANTED

/**
 * Runs the given [onPermissionsGranted] function if all of the permissions are already granted.
 * Otherwise, requests the permissions which are not already granted, to be handled in
 * [Activity.onRequestPermissionsResult] callback, either by manually checking the request
 * results, or, more simply, by propagating the results to the [permissionGateResult] method.
 */
fun Activity.permissionGate(permissions: Array<String>,
                            onPermissionsGranted: () -> Unit) {
    val required = permissions.filter { !checkPermission(it) }
    if (required.isEmpty()) {
        onPermissionsGranted()
    } else {
        ActivityCompat.requestPermissions(
                this,
                required.toTypedArray(),
                123
        )
    }
}

/**
 * Runs the given [onPermissionsGranted] function if the given grant results (usually supplied
 * through the [Activity.onRequestPermissionsResult] callback) are successful, otherwise
 * shows the given permission denial message and quits the application.
 * Best used in combination with [permissionGate].
 */
fun Activity.permissionGateResult(grantResults: IntArray,
                                  @StringRes permissionDenialMessage: Int,
                                  onPermissionsGranted: () -> Unit) {
    if (grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
        onPermissionsGranted()
    } else {
        longToast(permissionDenialMessage)
        finishAndRemoveTask()
    }
}
