package `Pertemuan 2`


fun main() {
    val namaDepan = "Abdul"
    val namaBelakang = "Muhith"
    var usia= 56
    usia=20

    //Nullable Type
    val text: String? = null
    var textLength = text?.length
    println(textLength)

    println("Hallo Nama saya $namaDepan $namaBelakang usia saya $usia") // $ merupakan String template

    //Char
    //-- ++
    var vocal = 'A'  //A = 0041 B = 0042
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )

    //Collection

    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["London"])

    val anyList = mutableListOf('A',"Kotlin",3,true, User())

    anyList.add('D')
    anyList.add(0,12)
    anyList[4]=false
    anyList.removeAt(5)

    println("MutableList = $anyList")


}

fun User(){
}