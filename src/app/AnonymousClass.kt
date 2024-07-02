package app

import data.Action


fun fireAction(action: Action){
    action.action()
}

class SampleAction : Action{
    override fun action() {
        println("This is sample action")
    }
}

fun main() {

    fireAction(SampleAction())

    fireAction(object : Action{
        override fun action() = println("This is Action 1")
    })

    fireAction(object : Action{
        override fun action() = println("This is Action 2")
    })

}
