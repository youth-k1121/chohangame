package com.example.cho_han_game.domain_model

import java.util.Date

data class PlayHistory(
    val dice1Number: Int,
    val dice2Number: Int,
    val answer: Answer,
    val isCorrectAnswer: Boolean,
    val date: Date
)