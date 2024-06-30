package data

interface Interaction {
    val name: String
    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction{
    fun go(){
        println("Go!")
    }
}

class Human(override val name: String) : Go {

//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}")
//    }
}