package de.troido.ekstend

import java.util.UUID

private const val HEX_CHARS = "0123456789abcdefABCDEF"

val UUID.bytes: ByteArray
    get() = hexStringToByteArray(toString().replace("-", ""))
