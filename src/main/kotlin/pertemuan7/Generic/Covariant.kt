package pertemuan7.Generic

class Covariant <out T>(val data: T){
    fun data() :T{
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("plugin")
    val data2 : Covariant<Any> = data1

    println(data2.data)
}
