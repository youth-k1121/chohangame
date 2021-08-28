package com.example.cho_han_game.feature.play.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cho_han_game.domain_model.ChoHanResult
import com.example.cho_han_game.feature.play.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    companion object {
        private const val BUNDLE_CHO_HAN_RESULT = "ChoHanResult"

        fun newInstance(result: ChoHanResult): ResultFragment {
            return ResultFragment().apply {
                arguments = bundleOf(BUNDLE_CHO_HAN_RESULT to result)
            }
        }
    }

    private var binding: FragmentResultBinding? = null
    private val viewModel: ResultViewModel by viewModels { ResultViewModel.Factory(result) }

    private val interactionListener: ActivityInteractionListener by lazy { requireActivity() as ActivityInteractionListener }

    private val result: ChoHanResult by lazy {
        arguments?.getParcelable(BUNDLE_CHO_HAN_RESULT) ?: ChoHanResult(0, 0, false)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentResultBinding.inflate(inflater, container, false).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.uiModel = viewModel.resultUiModel
        binding?.retryButton?.setOnClickListener { _ -> interactionListener.onSelectRetry() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    interface ActivityInteractionListener {
        fun onSelectRetry()
    }

}