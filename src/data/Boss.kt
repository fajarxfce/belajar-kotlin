package data

class Boss(val name: String) {
    inner class Employee(val name: String){
        fun hi(){
            println("My name is $name, my boss name is ${this@Boss.name}")
        }
    }
}