package Pertemuan4.Class

class SmartPhone(var name: String, var brand: String, var year: Int, var isAndroid: Boolean)

val SmartPhone.getSmartPhoneInfo: String
    get() = "Nama = ${this.name}, Brand = ${this.brand}, Tahun Rilis ${this.year}, Android = ${this.isAndroid}"