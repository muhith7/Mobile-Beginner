package Pertemuan4.Class

class Animal(
    var name: String,
    val weight: Double,
    val age: Int,
    val isMamal: Boolean
){
    fun eat(){
        println("hai $name waktunya mkana !")
    }

    fun sleep(){
        println("hai $name waktunya tidur")
    }
}