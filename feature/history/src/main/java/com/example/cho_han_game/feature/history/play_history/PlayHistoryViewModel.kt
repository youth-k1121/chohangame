package com.example.cho_han_game.feature.history.play_history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cho_han_game.uimodel.PlayHistoryUiModel

class PlayHistoryViewModel : ViewModel() {
    private val _playHistoryList = MutableLiveData(PlayHistoryUiModel.dummyList)
    val playHistoryList: LiveData<List<PlayHistoryUiModel>>
        get() = _playHistoryList


}