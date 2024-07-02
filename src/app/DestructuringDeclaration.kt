package app

import data.Game
import data.Login
import data.MinMax
import kotlin.math.log

fun minMax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) : Boolean{
    return callback(login)
}

fun main() {
    val game = Game("PUBG", 10000)
//    val name = game.name
//    val price = game.price

    val (name,  price) = game

    println(name)


    val (min, max) = MinMax(10, 100)
    println(min)
    println(max)

    val login = Login("fajar", "rahasia")
//    login(login) {
//        login.username == "fajar" && login.password == "rahasia"
//    }

    login(login){(username, password) ->
        username == "fajar" && password == "rahasia"
    }
}