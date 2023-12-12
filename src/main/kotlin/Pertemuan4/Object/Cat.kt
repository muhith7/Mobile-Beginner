package Pertemuan4.Object

import Pertemuan4.Class.Animal

//val namaObjeknya = namaClassnya([propertinya])
//val nama = "Muhith"

fun main() {
    val pluginCat = Animal ("Mili",2.2,1,true)
    println("Nama = ${pluginCat.name}, Berat = ${pluginCat.weight}kg, Usia = ${pluginCat.age} Tahun, Mamalia = ${pluginCat.isMamal} ")
    pluginCat.name="miu"
    println("Nama = ${pluginCat.name}, Berat = ${pluginCat.weight}kg, Usia = ${pluginCat.age} Tahun, Mamalia = ${pluginCat.isMamal} ")
    pluginCat.eat()
    pluginCat.sleep()
    //Getter Setter

}