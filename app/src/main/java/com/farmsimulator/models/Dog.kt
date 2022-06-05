package com.farmsimulator.models

open class Dog(override val sex: String, open var loyalty: Int): Animal("Dog", 2, listOf("Meat", "Kibble", "Carcass"), "Woof, Woof!") {

    // A dog can be played with, petted, and trained in order to increase its loyalty.

    val maxLoyalty = 500

    fun loyaltyIncrease(factor: Int): Int {
        loyalty += factor
        if (loyalty > maxLoyalty) loyalty = maxLoyalty
        return loyalty
    }

    fun pet() {
        loyaltyIncrease(5)
        if (loyalty < maxLoyalty) {
            println("I have just been petted. My new loyalty is $loyalty")
        } else {
            println("I have just been petted. My loyalty, however, is already maxed out.")
        }
    }

    fun play() {
        loyaltyIncrease(10)
        if (loyalty < maxLoyalty) {
            println("I have just been played with. My new loyalty is $loyalty")
        } else {
            println("I have just been played with. My loyalty, however, is already maxed out.")
        }
    }

    //A dog can be trained to increase its loyalty, but only if its loyalty is already over 50.
    fun train () {
        if (loyalty < 50) {
            println("I cannot be trained jet as my loyalty is still too low. It needs to be at 50, it is now at $loyalty")
        } else if (loyalty == maxLoyalty) {
            println("I am already fully trained, my loyalty is maxed out.")
        } else {
            loyaltyIncrease(20)
            println("I have just been trained. My loyalty increased by 20, my new loyalty is $loyalty")
        }
    }

}