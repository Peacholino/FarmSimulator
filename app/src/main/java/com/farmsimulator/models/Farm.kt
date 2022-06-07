package com.farmsimulator.models

open class Farm {
    open var chickenFarm = mutableListOf<Chicken>()
    open var cowFarm = mutableListOf<Cow>()
    open var dogFarm = listOf<Dog>()
    open var dragonFarm = listOf<Dragon>()

    fun putInFarm(c: Chicken) {
        chickenFarm.add(c)
    }

    fun putInFarm(c: Cow) {
        cowFarm.add(c)
    }

    fun bericht() {
        println(chickenFarm.joinToString(" "))
        println(cowFarm.joinToString(" "))
    }
}