package com.example.cho_han_game.domain_model

class Dealer(
    val dice1: Dice = Dice(),
    val dice2: Dice = Dice()
) {
    fun rollDices() {
        dice1.roll()
        dice2.roll()
    }

    fun judge(answer: Answer): Boolean {
        val sum = dice1.shownNumber + dice2.shownNumber
        return sum % 2 == answer.remainderOfTwo
    }
}