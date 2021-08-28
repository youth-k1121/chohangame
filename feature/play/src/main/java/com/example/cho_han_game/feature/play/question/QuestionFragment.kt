package com.example.cho_han_game.feature.play.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.feature.play.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    private var binding: FragmentQuestionBinding? = null

    private val viewModel: QuestionViewModel by viewModels()
    
    private val interaction: ActivityInteractionInterface by lazy { requireActivity() as ActivityInteractionInterface }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentQuestionBinding.inflate(inflater, container, false).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.viewModel = viewModel
        viewModel.result.observe(viewLifecycleOwner) { result ->
            interaction.onEndGame(result)
        }
    }
    
    companion object {
        fun newInstance(): QuestionFragment = QuestionFragment()
    }
    
    interface ActivityInteractionInterface {
        fun onEndGame(result: ChoHanResult)
    }
}