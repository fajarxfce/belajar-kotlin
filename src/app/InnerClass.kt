package app

import data.Boss

fun main() {
    val boss = Boss("Fajar")
    val employee = boss.Employee("Eko")

    employee.hi()
}