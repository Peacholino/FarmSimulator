package com.farmsimulator.models

class Chicken(override val sex: String) : Animal("Chicken", 3, listOf("Seeds", "Corn", "Scraps", "Eggshells"), "Cluck, Cluck!") {
}