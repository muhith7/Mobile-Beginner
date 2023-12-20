package Pertemuan6

fun main() {
//    val ucapan = ucapanUlangtahun() -> Tanpa Parameter
    println(ucapanUlangtahun("POLTEK",25))
    println(ucapanUlangtahun("PLUG-IN",10))
    println(ucapanUlangtahun(age = 12, name = "Aqna")) //Named Parameter
}

fun ucapanUlangtahun(name: String,age: Int): String{
    val nama = "Selamat Ulang Tahun, $name !"
    val usia = "Sekarang Usia $name $age Tahun !"

//    println("Selamat Ulang tahun, Plugin !")
//    println("Sekarang usia anda 10 tahun")
    return "$nama\n$usia"
}