package com.example.cho_han_game.uimodel

import com.example.cho_han_game.domain_model.ChoHanResult
import java.lang.IllegalArgumentException

data class ResultUiModel(
    val dice1ImgResId: Int,
    val dice2ImgResId: Int,
    val resultText: String
) {

    companion object {
        fun from(result: ChoHanResult) = ResultUiModel(
            getDiceImgResId(result.dice1Number),
            getDiceImgResId(result.dice2Number),
            resultText = if (result.correctAnswer) "正解！" else "残念！"
        )

        private fun getDiceImgResId(diceNumber: Int): Int {
            return when(diceNumber) {
                1 -> R.drawable.img_dice_1
                2 -> R.drawable.img_dice_2
                3 -> R.drawable.img_dice_3
                4 -> R.drawable.img_dice_4
                5 -> R.drawable.img_dice_5
                6 -> R.drawable.img_dice_6
                else -> throw IllegalArgumentException("Number should be between 1 and 6. Actual:$diceNumber")
            }
        }
    }
}