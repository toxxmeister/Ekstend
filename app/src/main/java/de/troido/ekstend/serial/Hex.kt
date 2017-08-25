package de.troido.ekstend.serial

private const val HEX_CHARS = "0123456789abcdef"

fun hexStringToByteArray(s: String): ByteArray = s.toLowerCase().let {
    val result = ByteArray(it.length / 2)
    for (i in 0 until it.length step 2) {
        result[i.shr(1)] =
                HEX_CHARS.indexOf(it[i])
                        .shl(4)
                        .or(HEX_CHARS.indexOf(it[i + 1]))
                        .toByte()
    }
    return result
}

fun ByteArray.toHex(): String {
    val result = StringBuffer()
    forEach {
        val octet = it.toInt()
        result.append(HEX_CHARS[(octet and 0xF0).ushr(4)])
        result.append(HEX_CHARS[octet and 0x0F])
    }
    return result.toString()
}
