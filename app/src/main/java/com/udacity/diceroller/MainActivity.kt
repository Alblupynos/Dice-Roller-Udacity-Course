package com.udacity.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.udacity.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rollButton.apply {
            text = getString(R.string.button_text)
            setOnClickListener { rollDice() }
        }
    }

    private fun rollDice() {
        binding.diceImage.setImageResource(
            when (Random.nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
    }
}
