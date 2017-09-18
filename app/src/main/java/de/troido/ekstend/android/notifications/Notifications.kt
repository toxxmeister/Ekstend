package de.troido.ekstend.android.notifications

import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.graphics.Bitmap
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.app.NotificationCompat
import android.widget.RemoteViews
import de.troido.ekstend.android.system.notificationManager

inline fun Context.notification(
        channelId: String,
        title: String,
        text: String,
        @DrawableRes smallIcon: Int,
        largeIcon: Bitmap? = null,
        info: String? = null,
        @ColorRes color: Int? = null,
        intent: PendingIntent? = null,
        content: RemoteViews? = null,
        autoCancel: Boolean? = null,
        block: NotificationCompat.Builder.() -> Unit
): Notification =
        NotificationCompat.Builder(this, channelId).apply {
            setContentTitle(title)
            setContentText(text)
            setSmallIcon(smallIcon)
            largeIcon?.let(this::setLargeIcon)
            color?.let(this::setColor)
            info?.let(this::setContentInfo)
            intent?.let(this::setContentIntent)
            content?.let(this::setContent)
            autoCancel?.let(this::setAutoCancel)
            block()
        }.build()

@Suppress("NOTHING_TO_INLINE")
inline fun Context.notification(
        channelId: String,
        title: String,
        text: String,
        @DrawableRes smallIcon: Int,
        largeIcon: Bitmap? = null,
        info: String? = null,
        @ColorRes color: Int? = null,
        intent: PendingIntent? = null,
        content: RemoteViews? = null,
        autoCancel: Boolean? = null
): Notification =
        notification(channelId, title, text, smallIcon, largeIcon,
                     info, color, intent, content, autoCancel) {}

@Suppress("NOTHING_TO_INLINE")
inline fun Context.notify(id: Int, notification: Notification) {
    notificationManager.notify(id, notification)
}

@Suppress("NOTHING_TO_INLINE")
inline fun Context.notify(notification: Notification) {
    notificationManager.notify(0, notification)
}
