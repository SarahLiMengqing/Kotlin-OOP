package com.rsk

abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name : String) : SpaceBody(name) {
    override fun calculateMotion() {
        TODO("not implemented")
    }
}

/*
open class Planet(name: String, diameter: Int) : SpaceBody(name) {
    open var population: Long = 0
    init {
        population = 0
        println("We've been created with name: $name")
    }

    val radius: Int = diameter/2


    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean) : this(name, diameter)

    fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // todo
    }
    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        return population + startPopulation;
    }
}

class HabitablePlanet(name: String, diameter: Int) : Planet(name, diameter) {
    override var population: Long = 0
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}
*/