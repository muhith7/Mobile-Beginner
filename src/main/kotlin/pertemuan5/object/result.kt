package pertemuan5.`object`

import pertemuan5.`class`.Calculator

fun main() {
    val calcuator = Calculator()

    val hasilInt = calcuator.tambah(5,3)
    val hasilDouble = calcuator.tambah(2.5,3.5)

    println("hasil penjumlahan Int = $hasilInt")
    println("hasil penjumlahan Double = $hasilDouble")
}