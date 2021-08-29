package com.example.cho_han_game.feature.play

import androidx.appcompat.app.AppCompatActivity
import com.example.cho_han_game.common_navigation.Navigation

interface PlayFeatureNavigation : Navigation{
    fun navigateToHistory(activity: AppCompatActivity)
}