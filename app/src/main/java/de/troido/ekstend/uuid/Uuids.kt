package de.troido.ekstend.uuid

import de.troido.ekstend.serial.hexStringToByteArray
import java.util.UUID

private const val HEX_CHARS = "0123456789abcdefABCDEF"

val UUID.bytes: ByteArray
    get() = hexStringToByteArray(toString().replace("-", ""))
