package Pertemuan4.Class

class Laptop(name: String, brand:String, year: Int = 2019) {
    val name:String
    val brand:String
    val year:Int
    var price:Int

    init {
        this.name = name
        this.brand = brand
        this.year = if (year < 2015)0 else year
        this.price = 200000
    }
    constructor(name: String,brand: String,year: Int,price: Int): this(name,brand,year){
        this.price = price
    }
}