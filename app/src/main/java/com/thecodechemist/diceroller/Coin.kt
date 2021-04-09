package com.thecodechemist.diceroller

class Coin(private val numSides: Int = 2, private val color: String = "None") {

    fun roll(): String {
        val flip = (1..numSides).random()
        if(flip == 1) {
            return "Heads"
        } else {
            return "Tails"
        }
    }
}