package com.farmsimulator.models

open class Dog(open var loyalty: Int): Animal("Dog", 7, listOf("Meat", "Kibble", "Carcass"), "Woof, Woof!") {

    // A dog can be played with, petted, and trained in order to increase its loyalty.

    val maxLoyalty = 500

    fun loyaltyIncrease(factor: Int): Int {
        loyalty += factor
        if (loyalty > maxLoyalty) loyalty = maxLoyalty
        return loyalty
    }

    fun loyaltyDecrease(factor: Int): Int {
        loyalty -= factor
        if (loyalty < 0) loyalty = 0
        return loyalty
    }

    fun pet() {
        loyaltyIncrease(5)
        println("I have just been petted. That feels nice! My new loyalty is $loyalty")
    }

    fun play() {
        loyaltyIncrease(10)
        println("I have just been played with. That was fun! My new loyalty is $loyalty")
    }

    //A dog can be trained to increase its loyalty, but only if its loyalty is already over 50.
    fun train () {
        if (loyalty > 50) {
            loyaltyIncrease(20)
            println("I have just been trained. My loyalty is now $loyalty")
        } else println("I cannot be trained jet as my loyalty is still too low. It needs to be at 50, it is now at $loyalty")
    }

}