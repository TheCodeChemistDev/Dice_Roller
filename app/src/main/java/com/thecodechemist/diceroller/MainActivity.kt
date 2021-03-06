package com.thecodechemist.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/*
*   Activity allows the user to press a button to roll the dice and display a number on screen
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }

    // Sets a random number as the TextView based on a dice roll
    private fun rollDice() {
        //Create a dice with 6 sides and roll it
        val dice = Dice(6, "Red")
        val diceRoll = dice.roll()

        //Determine which dice image should be displayed
        val imageResource = dice.getDiceImage(diceRoll)

        //Display the dice image and set the content description to the number rolled
        val resultImageView: ImageView = findViewById(R.id.imageView)
        resultImageView.setImageResource(imageResource)
        resultImageView.contentDescription = diceRoll.toString()
    }


}

