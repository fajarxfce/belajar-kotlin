package app

import data.Token

fun main() {
    val token = Token("Anjay")

    println(token.value)
    println(token.toUpper())
}