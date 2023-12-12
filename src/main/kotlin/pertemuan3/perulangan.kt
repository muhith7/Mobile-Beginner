package pertemuan3


fun main() {
    for (i in 10 downTo 5){
        println("nilai = $i")
    }

    val cars = arrayOf("volvo","BMW","ford","Mazda")
    for (x in cars){
        println(x)
    }

    var i = 0
    while (i > 5){
        println("nilai $i")
        i++
    }

    var percobaan = 1
    do {
        println("buka pintu - percobaan ke $percobaan")
        percobaan++
    }while (percobaan < 5)

}