package data

abstract class Animal {
    abstract val name:String
    abstract fun run()
}

class Cat : Animal() {

    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }

}

class Dog : Animal() {
    override val name: String = "Pler"
    override fun run() {
        println("Dog $name run")
    }
}