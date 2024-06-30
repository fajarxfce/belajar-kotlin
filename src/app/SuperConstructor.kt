package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {

    val premiumCustomer = PremiumCustomer("Fajar")

    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Nurul", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}