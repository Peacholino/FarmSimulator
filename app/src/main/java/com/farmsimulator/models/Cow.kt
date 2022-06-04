package com.farmsimulator.models

open class Cow(override val sex: String) : Animal("Cow", 15, listOf("Hay", "Grass", "Carrots", "Corn"), "Moo!") {

    fun milk() {
        if (sex == "female") {
            healthIncrease(2)
            println("I have just been milked! My new health just increased by 2, my new health is $health")
        } else {
            healthDecrease(5)
            println("Im a bull, can't milk me! My health just decreased by 5, my new health is $health")
        }
    }
/* female cows can be milked, which increases their health.
Male cows cannot be milked and their health decreases if tried */

    var cowBarn = listOf<String>()
}