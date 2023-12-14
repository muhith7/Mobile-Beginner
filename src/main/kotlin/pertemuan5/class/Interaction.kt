package pertemuan5.`class`

interface Interaction {
    val name : String

    fun sayHello(name: String)
}
class Company(override val name: String) :Interaction{
    override fun sayHello(name: String){
        println("Hello $name walcome to ${this.name}")
    }
}

