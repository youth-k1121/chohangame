package com.example.cho_han_game.feature.play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.cho_han_game.navigation.NavigationRegistry
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.feature.play.databinding.ActivityPlayBinding
import com.example.cho_han_game.feature.play.question.QuestionFragment
import com.example.cho_han_game.feature.play.result.ResultFragment

class PlayActivity : AppCompatActivity(),
    QuestionFragment.ActivityInteractionInterface,
    ResultFragment.ActivityInteractionListener {

    private var binding: ActivityPlayBinding? = null

    private val navigation: PlayFeatureNavigation by lazy { NavigationRegistry.of() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolBar)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.newInstance())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.play_tool_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.action_history -> {
            navigation.navigateToHistory(this)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
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