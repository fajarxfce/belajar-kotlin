package data

class Student(val name:String, val age:Int)

//cuma bisa akses public member dari class parent
fun Student.sayHello(name: String){
    println("Hello $name, my name is ${this.name}")
}