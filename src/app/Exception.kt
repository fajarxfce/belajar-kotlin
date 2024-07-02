package app

import exception.ValidationException

fun validateAndSayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("Name cannot be blank")
    }
    println("Hello $name")
}

fun main() {
//    validateAndSayHello("Fajar")
//    validateAndSayHello("")

    try {
        validateAndSayHello("Fajar")
        validateAndSayHello("")
    }catch (error: ValidationException){
        println("Terjadi error ${error.message}")
    }catch (e: Exception){
        println("Terjadi kesalahan ${e.message}")
    }finally {
        println("Program selesai")
    }// finally akan tereksekusi walaupun program error

}