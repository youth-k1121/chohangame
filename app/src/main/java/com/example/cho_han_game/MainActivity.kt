package com.example.cho_han_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.feature.play.question.QuestionFragment
import com.example.cho_han_game.feature.play.result.ResultFragment

class MainActivity : AppCompatActivity(R.layout.activity_main),
    QuestionFragment.ActivityInteractionInterface,
    ResultFragment.ActivityInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.newInstance())
            .commit()
    }

    override fun onEndGame(result: ChoHanResult) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ResultFragment.newInstance(result))
            .commit()
    }

    override fun onSelectRetry() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.newInstance())
            .commit()
    }
}