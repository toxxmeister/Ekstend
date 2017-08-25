package de.troido.ekstend.android.system

import android.location.Location
import android.location.LocationListener
import android.os.Bundle

class OnLocationChanged(private val f: (location: Location) -> Unit) : SimpleLocationListener {
    override fun onLocationChanged(location: Location?) {
        location?.let(f)
    }
}

interface SimpleLocationListener : LocationListener {
    override fun onLocationChanged(location: Location?) = Unit
    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) = Unit
    override fun onProviderEnabled(provider: String?) = Unit
    override fun onProviderDisabled(provider: String?) = Unit
}
