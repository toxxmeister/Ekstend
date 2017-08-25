package de.troido.ekstend.android.system

import android.accounts.AccountManager
import android.app.ActivityManager
import android.app.AlarmManager
import android.app.AppOpsManager
import android.app.DownloadManager
import android.app.KeyguardManager
import android.app.NotificationManager
import android.app.SearchManager
import android.app.UiModeManager
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.app.usage.NetworkStatsManager
import android.app.usage.UsageStatsManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.content.RestrictionsManager
import android.content.pm.LauncherApps
import android.content.pm.ShortcutManager
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.camera2.CameraManager
import android.hardware.display.DisplayManager
import android.hardware.fingerprint.FingerprintManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.media.midi.MidiManager
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.net.ConnectivityManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.BatteryManager
import android.os.Build
import android.os.DropBoxManager
import android.os.HardwarePropertiesManager
import android.os.PowerManager
import android.os.UserManager
import android.os.Vibrator
import android.os.storage.StorageManager
import android.print.PrintManager
import android.service.wallpaper.WallpaperService
import android.support.annotation.RequiresApi
import android.telecom.TelecomManager
import android.telephony.CarrierConfigManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.accessibility.CaptioningManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

/** Returns a [Context.POWER_SERVICE] system service.*/
val Context.powerManager: PowerManager
    get() = getSystemService(Context.POWER_SERVICE) as PowerManager

/** Returns a [Context.WINDOW_SERVICE] system service. */
val Context.windowManager: WindowManager
    get() = getSystemService(Context.WINDOW_SERVICE) as WindowManager

/** Returns a [Context.LAYOUT_INFLATER_SERVICE] system service. */
val Context.layoutInflater: LayoutInflater
    get() = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

/** Returns a [Context.ACCOUNT_SERVICE] system service. */
val Context.accountManager: AccountManager
    get() = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager

/** Returns a [Context.ACTIVITY_SERVICE] system service. */
val Context.activityManager: ActivityManager
    get() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

/** Returns a [Context.ALARM_SERVICE] system service. */
val Context.alarmManager: AlarmManager
    get() = getSystemService(Context.ALARM_SERVICE) as AlarmManager

/** Returns a [Context.NOTIFICATION_SERVICE] system service. */
val Context.notificationManager: NotificationManager
    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

/** Returns a [Context.ACCESSIBILITY_SERVICE] system service. */
val Context.accessibilityManager: AccessibilityManager
    get() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

/** Returns a [Context.CAPTIONING_SERVICE] system service. */
val Context.captioningManager: CaptioningManager
    get() = getSystemService(Context.CAPTIONING_SERVICE) as CaptioningManager

/** Returns a [Context.KEYGUARD_SERVICE] system service. */
val Context.keyguardManager: KeyguardManager
    get() = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

/** Returns a [Context.LOCATION_SERVICE] system service. */
val Context.locationManager: LocationManager
    get() = getSystemService(Context.LOCATION_SERVICE) as LocationManager

/** Returns a [Context.SEARCH_SERVICE] system service. */
val Context.searchManager: SearchManager
    get() = getSystemService(Context.SEARCH_SERVICE) as SearchManager

/** Returns a [Context.SENSOR_SERVICE] system service. */
val Context.sensorManager: SensorManager
    get() = getSystemService(Context.SENSOR_SERVICE) as SensorManager

/** Returns a [Context.STORAGE_SERVICE] system service. */
val Context.storageManager: StorageManager
    get() = getSystemService(Context.STORAGE_SERVICE) as StorageManager

/** Returns a [Context.WALLPAPER_SERVICE] system service. */
val Context.wallpaperService: WallpaperService
    get() = getSystemService(Context.WALLPAPER_SERVICE) as WallpaperService

/** Returns a [Context.VIBRATOR_SERVICE] system service. */
val Context.vibrator: Vibrator
    get() = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

/** Returns a [Context.CONNECTIVITY_SERVICE] system service. */
val Context.connectivityManager: ConnectivityManager
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

/** Returns a [Context.NETWORK_STATS_SERVICE] system service. */
val Context.networkStatsManager: NetworkStatsManager
    @RequiresApi(Build.VERSION_CODES.M)
    get() = getSystemService(Context.NETWORK_STATS_SERVICE) as NetworkStatsManager

/** Returns a [Context.WIFI_SERVICE] system service. */
val Context.wifiManager: WifiManager
    get() = getSystemService(Context.WIFI_SERVICE) as WifiManager

/** Returns a [Context.WIFI_P2P_SERVICE] system service. */
val Context.wifiP2pManager: WifiP2pManager
    get() = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager

/** Returns a [Context.NSD_SERVICE] system service. */
val Context.nsdManager: NsdManager
    get() = getSystemService(Context.NSD_SERVICE) as NsdManager

/** Returns a [Context.AUDIO_SERVICE] system service. */
val Context.audioManager: AudioManager
    get() = getSystemService(Context.AUDIO_SERVICE) as AudioManager

/** Returns a [Context.FINGERPRINT_SERVICE] system service. */
val Context.fingerprintManager: FingerprintManager
    @RequiresApi(Build.VERSION_CODES.M)
    get() = getSystemService(Context.FINGERPRINT_SERVICE) as FingerprintManager

/** Returns a [Context.MEDIA_ROUTER_SERVICE] system service. */
val Context.mediaRouter: MediaRouter
    get() = getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter

/** Returns a [Context.TELEPHONY_SERVICE] system service. */
val Context.telephonyManager: TelephonyManager
    get() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

/** Returns a [Context.TELEPHONY_SUBSCRIPTION_SERVICE] system service. */
val Context.subscriptionManager: SubscriptionManager
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    get() = getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE) as SubscriptionManager

/** Returns a [Context.CARRIER_CONFIG_SERVICE] system service. */
val Context.carrierConfigManager: CarrierConfigManager
    @RequiresApi(Build.VERSION_CODES.M)
    get() = getSystemService(Context.CARRIER_CONFIG_SERVICE) as CarrierConfigManager

/** Returns a [Context.TELECOM_SERVICE] system service. */
val Context.telecomManager: TelecomManager
    get() = getSystemService(Context.TELECOM_SERVICE) as TelecomManager

/** Returns a [Context.CLIPBOARD_SERVICE] system service. */
val Context.clipboardManager: ClipboardManager
    get() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

/** Returns a [Context.INPUT_METHOD_SERVICE] system service. */
val Context.inputMethodManager: InputMethodManager
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

/** Returns a [Context.TEXT_SERVICES_MANAGER_SERVICE] system service. */
val Context.textServicesManager: TextServicesManager
    get() = getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager

/** Returns a [Context.APPWIDGET_SERVICE] system service. */
val Context.appWidgetManager: AppWidgetManager
    get() = getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager

/** Returns a [Context.DROPBOX_SERVICE] system service. */
val Context.dropBoxManager: DropBoxManager
    get() = getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager

/** Returns a [Context.DEVICE_POLICY_SERVICE] system service. */
val Context.devicePolicyManager: DevicePolicyManager
    get() = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

/** Returns a [Context.UI_MODE_SERVICE] system service. */
val Context.uiModeManager: UiModeManager
    get() = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager

/** Returns a [Context.DOWNLOAD_SERVICE] system service. */
val Context.downloadManager: DownloadManager
    get() = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

/** Returns a [Context.NFC_SERVICE] system service. */
val Context.nfcManager: NfcManager
    get() = getSystemService(Context.NFC_SERVICE) as NfcManager

/** Returns a [Context.BLUETOOTH_SERVICE] system service. */
val Context.bluetoothManager: BluetoothManager
    get() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager

/** Returns a [Context.USB_SERVICE] system service. */
val Context.usbManager: UsbManager
    get() = getSystemService(Context.USB_SERVICE) as UsbManager

/** Returns a [Context.LAUNCHER_APPS_SERVICE] system service. */
val Context.launcherApps: LauncherApps
    get() = getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps

/** Returns a [Context.INPUT_SERVICE] system service. */
val Context.inputManager: InputManager
    get() = getSystemService(Context.INPUT_SERVICE) as InputManager

/** Returns a [Context.DISPLAY_SERVICE] system service. */
val Context.displayManager: DisplayManager
    get() = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager

/** Returns a [Context.USER_SERVICE] system service. */
val Context.userManager: UserManager
    get() = getSystemService(Context.USER_SERVICE) as UserManager

/** Returns a [Context.RESTRICTIONS_SERVICE] system service. */
val Context.restrictionsManager: RestrictionsManager
    get() = getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager

/** Returns a [Context.APP_OPS_SERVICE] system service. */
val Context.appOpsManager: AppOpsManager
    get() = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager

/** Returns a [Context.CAMERA_SERVICE] system service. */
val Context.cameraManager: CameraManager
    get() = getSystemService(Context.CAMERA_SERVICE) as CameraManager

/** Returns a [Context.PRINT_SERVICE] system service. */
val Context.printManager: PrintManager
    get() = getSystemService(Context.PRINT_SERVICE) as PrintManager

/** Returns a [Context.CONSUMER_IR_SERVICE] system service. */
val Context.consumerIrManager: ConsumerIrManager
    get() = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager

/** Returns a [Context.TV_INPUT_SERVICE] system service. */
val Context.tvInputManager: TvInputManager
    get() = getSystemService(Context.TV_INPUT_SERVICE) as TvInputManager

/** Returns a [Context.USAGE_STATS_SERVICE] system service. */
val Context.usageStatsManager: UsageStatsManager
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    get() = getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager

/** Returns a [Context.MEDIA_SESSION_SERVICE] system service. */
val Context.mediaSessionManager: MediaSessionManager
    get() = getSystemService(Context.MEDIA_SESSION_SERVICE) as MediaSessionManager

/** Returns a [Context.BATTERY_SERVICE] system service. */
val Context.batteryManager: BatteryManager
    get() = getSystemService(Context.BATTERY_SERVICE) as BatteryManager

/** Returns a [Context.JOB_SCHEDULER_SERVICE] system service. */
val Context.jobScheduler: JobScheduler
    get() = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler

/** Returns a [Context.MEDIA_PROJECTION_SERVICE] system service. */
val Context.mediaProjectionManager: MediaProjectionManager
    get() = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager

/** Returns a [Context.MIDI_SERVICE] system service. */
val Context.midiManager: MidiManager
    @RequiresApi(Build.VERSION_CODES.M)
    get() = getSystemService(Context.MIDI_SERVICE) as MidiManager

/** Returns a [Context.HARDWARE_PROPERTIES_SERVICE] system service. */
val Context.hardwarePropertiesManager: HardwarePropertiesManager
    @RequiresApi(Build.VERSION_CODES.N)
    get() = getSystemService(Context.HARDWARE_PROPERTIES_SERVICE) as HardwarePropertiesManager

/** Returns a [Context.SHORTCUT_SERVICE] system service. */
val Context.shortcutManager: ShortcutManager
    @RequiresApi(Build.VERSION_CODES.N_MR1)
    get() = getSystemService(Context.SHORTCUT_SERVICE) as ShortcutManager
