package com.example.cho_han_game.domain_model

import kotlin.random.Random

class Dice {
    var shownNumber: Int = randomNumber()
        private set

    fun roll() {
        shownNumber = randomNumber()
    }

    private fun randomNumber(): Int = Random.nextInt(1,6)
}