package com.example.cho_han_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.feature.play.PlayActivity
import com.example.cho_han_game.feature.play.question.QuestionFragment
import com.example.cho_han_game.feature.play.result.ResultFragment

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, PlayActivity::class.java)
        startActivity(intent)
        finish()
    }
}