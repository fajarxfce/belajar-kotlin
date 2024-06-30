package app

import data.Television

fun main() {

    //late init : properties tidak mesti diinisialisasi dulu
    val tv =Television()
//    println(tv.brand) // error, brand belum di inisialisasi

    tv.initTelevision("Samsung")
    println()
}