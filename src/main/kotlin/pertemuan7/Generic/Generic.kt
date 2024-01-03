package pertemuan7.Generic

class Box<T>(val box : T)

fun main() {
    val stirngBox = Box("Hello, Plugin")
    val valueString : String = stirngBox.box

    val intBox = Box(10)
    val velueInt : Int = intBox.box

    println("$valueString \n$velueInt")
    printItem("Hello Mobile")
    printItem(20)
}

fun <T> printItem(item : T){
    println(item)
}

