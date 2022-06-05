package com.farmsimulator.models

open class Animal(open val name: String, size: Int, open val diet: List<String>, open var call: String) : Farm() {
    open val sex: String = "female"
    open var health: Int = 100
    open val maxHealth: Int = 100
    open var breedingSuccess: Boolean = false

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

    /* Animals can breed if the two parents are of the same sex and their health is above 50.
    If breeding was successful, the parents' health decreases by 20. */
    fun breed(animal2: Animal) {
        if(this.sex != animal2.sex && this.health >= 50 && animal2.health >= 50) {
            println("breeding successful!")
            this.healthDecrease(20)
            animal2.healthDecrease(20)
            println("The health of the parents decreased. Parent No.1 now has ${this.health} health, parent No.2 now has ${animal2.health} health.")
            breedingSuccess = true
        } else if (this.sex == animal2.sex){
            println("breeding unsuccessful! The cows are of the same sex.")
            breedingSuccess = false
        } else {
            println("breeding unsuccessful! Parents' health is too low.")
            breedingSuccess = false
        }
    }
}