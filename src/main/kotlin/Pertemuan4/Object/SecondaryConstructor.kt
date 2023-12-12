package Pertemuan4.Object

import Pertemuan4.Class.Laptop

fun main() {
    val pluginLaptop = Laptop("Thinkpad","Lenovo",2023,2000000)
    println("Nama = ${pluginLaptop.name}, Brand = ${pluginLaptop.brand},Tahun = ${pluginLaptop.year}, Harga = ${pluginLaptop.price}")
}