package com.example.cho_han_game.usecase

import com.example.cho_han_game.domain_model.Answer
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.domain_model.Dealer

class ControlDealerUseCase {
    private val dealer: Dealer = Dealer()

    fun startGame() {
        dealer.rollDices()
    }

    fun getResult(answer: Answer): ChoHanResult {
        return ChoHanResult(
            dealer.dice1.shownNumber,
            dealer.dice2.shownNumber,
            dealer.judge(answer)
        )
    }
}