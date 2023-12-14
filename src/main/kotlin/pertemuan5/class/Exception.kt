package pertemuan5.`class`

import pertemuan5.Exception.ValidationException

fun validateAndSayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("name is blank")
    }else{
        println("hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Plugin")
        validateAndSayHello("")
        validateAndSayHello("Plugin")
    }catch (error : ValidationException){
        println("terjadi error ${error.message}")
    }finally {
        println("program berjalan")
    }
}


