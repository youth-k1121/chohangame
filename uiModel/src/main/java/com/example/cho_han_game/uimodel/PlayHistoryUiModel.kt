package com.example.cho_han_game.uimodel

data class PlayHistoryUiModel(
    val dice1ImgResId: Int,
    val dice2ImgResId: Int,
    val answer: String,
    val resultText: String,
    val date: String
) {
    companion object {
        val dummyList = listOf(
            PlayHistoryUiModel(
                R.drawable.img_dice_1,
                R.drawable.img_dice_1,
                "半",
                "不正解",
                "2021/08/29 10:00:00"
            )
        )
    }
}