package com.example.cho_han_game.feature.history

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cho_han_game.feature.history.play_history.PlayHistoryFragment

class HistoryActivity : AppCompatActivity(R.layout.activity_history) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, PlayHistoryFragment.newInstance())
            .commit()
    }
}