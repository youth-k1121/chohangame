package com.example.cho_han_game

import android.app.Application
import com.example.cho_han_game.navigation.NavigationRegistry
import com.example.cho_han_game.feature.play.PlayFeatureNavigation

class ChoHanGameApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        NavigationRegistry.run {
            clear()
            add(PlayFeatureNavigator, PlayFeatureNavigation::class.java)
        }
    }
}