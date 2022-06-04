package com.farmsimulator.models

class Chicken(override val sex: String) : Animal("Chicken", 3, listOf("Seeds", "Corn", "Scraps", "Eggshells"), "Cluck, Cluck!") {
    fun layEgg() {
        if (sex == "female") {
            println("I just laid an egg!")
        } else if (sex == "male"){
            println("Im a rooster, I can't lay eggs!")
        }
    }
}