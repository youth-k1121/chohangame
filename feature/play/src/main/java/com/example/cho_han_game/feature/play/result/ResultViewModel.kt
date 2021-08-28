package com.example.cho_han_game.feature.play.result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.uimodel.ResultUiModel

class ResultViewModel(
    result: ChoHanResult
) : ViewModel() {

    val resultUiModel = ResultUiModel.from(result)

    class Factory(private val result: ChoHanResult) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ResultViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return ResultViewModel(result) as T
            } else {
                throw IllegalArgumentException("must be ChoHanResult")
            }
        }

    }
}