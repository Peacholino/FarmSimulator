package com.farmsimulator.models

open class Cow(open val sex: String) : Animal("Cow", 15, listOf("Hay", "Grass", "Carrots", "Corn"), "Moo!") {

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

    val cow1 = Cow("female")
    val cow2 = Cow("male")
    var cowBarn = listOf<String>()

    fun breed(cow1: Cow, cow2: Cow) {
        if(cow1.sex != cow2.sex && cow1.health >= 50 && cow2.health >= 50) {
            println("breeding successful!")
            cow1.healthDecrease(20)
            cow2.healthDecrease(20)
            println("The health of the parents decreased. $cow1 now has ${cow1.health} health, $cow2 now has ${cow2.health} health.")
        } else if (cow1.sex == cow2.sex){
            println("breeding unsuccessful! The cows are of the same sex.")
        } else {
            println("breeding unsuccessful!")
        }
    }
}