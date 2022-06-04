package com.farmsimulator.models

open class Animal(name: String, size: Int, open val diet: List<String>, open var call: String) {
    open var age = 0
    open var sex = "female"
    open var health = 100
    open val maxHealth = 100

    fun healthIncrease(factor: Int): Int {
        health += factor
        if (health > maxHealth) health = maxHealth
        return health
    }

    fun healthDecrease(factor: Int): Int {
        health -= factor
        if (health < 0) health = 0
        return health
    }

    //if the animal is fed its diet its health increases, if it eats something else it decreases
    fun feed(food: String) {
        println("just had some $food")
        if (food in diet) {
            healthIncrease(10)
            println("I like $food! My health just increased by 10, my new health is $health")
        } else {
            healthDecrease(20)
            println("Ugh! I hate $food! My health just decreased by 20, my new health is $health")
        }
    }

    //The animal shouts its distinctive call
    fun shout() {
        println(call)
    }

    //if the animal sleeps its health increases by 15
    fun sleep() {
        println("good night!")
        healthIncrease(15)
        println("My health just increased by 15, my new health is $health")
    }
}
