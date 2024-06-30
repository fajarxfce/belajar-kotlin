package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android")

    println(smartPhone.toString()) //semua class di kotlin itu turunan dari class Any
}