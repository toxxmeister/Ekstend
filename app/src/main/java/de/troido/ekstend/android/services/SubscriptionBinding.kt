package de.troido.ekstend.android.services

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder

/**
 * Subscription-based service binding interface.
 * To be implemented by an [IBinder] to allow data observation from a [ServiceConnection] using
 * the provided [onData] callback.
 */
interface SubscriptionBinding<T> {
    fun subscribe(listener: (T) -> Unit)
    fun unsubscribe(listener: (T) -> Unit)
    fun onData(data: T)
}

/**
 * Returns a [ServiceConnection] which subscribes to the service with the given [onData] callback
 * when a connection is established, and unsubscribes the said callback on service disconnect.
 */
inline fun <T, reified B> subscriptionConnection(noinline onData: (T) -> Unit)
        where B : IBinder,
              B : SubscriptionBinding<T> =

        object : ServiceConnection {
            private var binding: SubscriptionBinding<T>? = null

            override fun onServiceConnected(name: ComponentName, service: IBinder) {
                service as B
                service.subscribe(onData)
                binding = service
            }

            override fun onServiceDisconnected(name: ComponentName) {
                binding?.unsubscribe(onData)
            }
        }
