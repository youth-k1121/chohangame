package com.example.cho_han_game.feature.play.question

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cho_han_game.domain_model.Answer
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.usecase.ControlDealerUseCase

class QuestionViewModel : ViewModel() {

    private val _result = MutableLiveData<ChoHanResult>()
    val result: LiveData<ChoHanResult> = _result

    private val controlDealerUseCase = ControlDealerUseCase()

    init {
        controlDealerUseCase.startGame()
    }

    fun onClickHan() {
        _result.value = controlDealerUseCase.getResult(Answer.HAN)
    }

    fun onClickCho() {
        _result.value = controlDealerUseCase.getResult(Answer.CHO)
    }
}