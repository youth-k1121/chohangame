package com.example.cho_han_game.feature.history.play_history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cho_han_game.feature.history.databinding.FragmentPlayHistoryBinding

class PlayHistoryFragment : Fragment() {

    companion object {
        fun newInstance() = PlayHistoryFragment()
    }

    private val viewModel: PlayHistoryViewModel by viewModels()
    private var binding: FragmentPlayHistoryBinding? = null
    private val listAdapter = PlayHistoryListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentPlayHistoryBinding.inflate(inflater, container, false)
            .also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            playHistoryList.layoutManager = LinearLayoutManager(context)
            playHistoryList.adapter = listAdapter
        }
        viewModel.playHistoryList.observe(viewLifecycleOwner) { list ->
            listAdapter.submitList(list)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        listAdapter.submitList(emptyList())
    }
}