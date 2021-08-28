package com.example.cho_han_game.domain_model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChoHanResult(
    val dice1Number: Int,
    val dice2Number: Int,
    val correctAnswer: Boolean
) : Parcelable