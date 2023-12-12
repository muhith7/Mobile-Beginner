package Pertemuan4.Object

import Pertemuan4.Class.Car

fun main() {
    val pluginCar = Car()
    println("Nama Mobil = ${pluginCar.name}")
    pluginCar.name = "Avanza"
    println("Nama Mobil = ${pluginCar.name}")
}