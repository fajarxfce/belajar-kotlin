package app

import data.Product

fun main() {
    val product = Product("Indomie", 4000, "Food")
    val product2 = product.copy(name = "Supermie")

    println(product)
    println(product2.name)
}