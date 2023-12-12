package `Pertemuan 3`

fun main() {
    val nilai = 70
    if(nilai > 50){
        println("Lulus")
    }else{
        println("Tidak Lulus")
    }
    // if di dalam if
    if(nilai>70){
        println("a")
    }else if(nilai>60){
        println("b")
    }else{
        println("c")
    }

val number=3
    val hasil=when(number){
        1 -> "satu"
        2 ->"dua"
        3 ->"tiga"
        else -> "nomer tidak valid"
    }
    println(hasil)



}
