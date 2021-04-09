package com.thecodechemist.diceroller

/*
* Dice object with a variable number of sides
 */
class Dice(private val numSides: Int, private val color: String) {

    // Simulates a roll based on a dice with the specified number of sides
    fun roll(): Int {
        return (1..numSides).random()
    }
}