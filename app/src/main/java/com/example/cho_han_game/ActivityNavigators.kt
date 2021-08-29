package com.example.cho_han_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.cho_han_game.feature.history.HistoryActivity
import com.example.cho_han_game.feature.play.PlayFeatureNavigation

object PlayFeatureNavigator : PlayFeatureNavigation {
    override fun navigateToHistory(activity: AppCompatActivity) {
        val intent = Intent(activity, HistoryActivity::class.java)
        activity.startActivity(intent)
    }
}