package com.farmsimulator.models

class Dragon(override val sex: String) : Animal("Dragon", 3, listOf("Humans", "Animals", "Cows", "Pigs", "Chickens", "Dogs", "Children"), "Roar!!") {
    fun fly() {
        println("I'm taking off!")
    }
}