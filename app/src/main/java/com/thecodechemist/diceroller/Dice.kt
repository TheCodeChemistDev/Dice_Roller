package com.thecodechemist.diceroller

/*
* Dice object with a variable number of sides
 */
class Dice(private val numSides: Int, private val color: String) {

    // Simulates a roll based on a dice with the specified number of sides
    fun roll(): Int {
        return (1..numSides).random()
    }

    fun getDiceImage(rolledNum: Int): Int {
        //Determine which dice image should be displayed
        var imageResource: Int

        if(this.color == "Black") {
            imageResource = when(rolledNum) {
                1 -> R.drawable.black_die_1
                2 -> R.drawable.black_die_2
                3 -> R.drawable.black_die_3
                4 -> R.drawable.black_die_4
                5 -> R.drawable.black_die_5
                else -> R.drawable.black_die_6
            }

        } else if(this.color == "Red") {
            imageResource = when(rolledNum) {
                1 -> R.drawable.red_die_1
                2 -> R.drawable.red_die_2
                3 -> R.drawable.red_die_3
                4 -> R.drawable.red_die_4
                5 -> R.drawable.red_die_5
                else -> R.drawable.red_die_6
            }
        } else {
            return 0;
        }

        return imageResource
    }
}