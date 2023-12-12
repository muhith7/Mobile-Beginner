package Pertemuan4.Class

class Car {
    var name: String = "Inova"
        get() {
            println("Fungsi Getter Terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}