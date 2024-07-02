package program

import annotations.Fancy

@Fancy(name = "fajar")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name - $version"
}