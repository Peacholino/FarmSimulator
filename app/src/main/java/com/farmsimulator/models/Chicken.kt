package com.farmsimulator.models

import kotlin.random.Random

open class Chicken(override val sex: String) : Animal("Chicken", 1, listOf("Seeds", "Corn", "Scraps", "Eggshells"), "Cluck, Cluck!") {

    fun layEgg() {
        if (sex == "female") {
            println("I just laid an egg!")
        } else if (sex == "male"){
            println("Im a rooster, I can't lay eggs!")
        }
    }
}

