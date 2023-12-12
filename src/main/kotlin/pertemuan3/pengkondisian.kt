package pertemuan3


fun main() {

    val nilai = 70

    if (nilai > 50){
        println("Lulus")
    }else{
        println("tidak lulus")
    }

//    if di dalam if
    if (nilai > 70){
        println("A")
    }else if(nilai > 60){
        println("B")
    }else{
        println("C")
    }

    val nummber = 5
    val hasil = when (nummber){
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        else -> "nomor tidak falid"
    }
    println(hasil)
}