package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any){
    println(any)
}

fun printObjectAny(any: Any){
    if (any is HandPhone){
        println("Handphone with name ${any.name}")
    } else if (any is Laptop){
        println("Laptop with name ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any){
        is HandPhone -> println("Handphone with name ${any.name}")
        is Laptop -> println("Laptop with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value : String? = any as? String
    println(value)
}

fun main() {

    printObject("Fajar")
    printObject(1000)
    printObject(Laptop("Samsung"))
    printObject(HandPhone("Acer"))

    printObjectAny(Laptop("Asus"))
    printObjectAny(HandPhone("Xiaomi"))

    printObjectWithWhen(Laptop("Anjay"))

    printString("Fajar")
//    printString(20) error .ClassCastException

    printStringSafe("Nurul")
    printStringSafe(10) // hasilnya null karna dipaksa jadi string
}