package app

import data.Company

fun main() {
    val company1 = Company("Pedro")
    val company2 = Company("Pedro")

    println(company1 == company2) //false
    println(company1 == company1)
}