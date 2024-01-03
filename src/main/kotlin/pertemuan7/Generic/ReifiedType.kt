package pertemuan7.Generic

inline fun <reified T> printType(value: T){
    val type = T::class.simpleName
    println("Type data dari $value = $type")
}

fun main() {
    printType(42)
    printType("hello")
}