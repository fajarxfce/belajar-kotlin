package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE

    val allGender : Array<Gender> = Gender.values()

    println(allGender.toList())
}