package com.example.cho_han_game.feature.history.play_history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cho_han_game.feature.history.databinding.ListItemPlayHistoryBinding
import com.example.cho_han_game.uimodel.PlayHistoryUiModel

class PlayHistoryListAdapter: ListAdapter<PlayHistoryUiModel, PlayHistoryViewHolder>(
    object :DiffUtil.ItemCallback<PlayHistoryUiModel>() {
        override fun areItemsTheSame(oldItem: PlayHistoryUiModel, newItem: PlayHistoryUiModel): Boolean = oldItem == newItem
        override fun areContentsTheSame(oldItem: PlayHistoryUiModel, newItem: PlayHistoryUiModel): Boolean = oldItem == newItem

    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayHistoryViewHolder {
        val binding = ListItemPlayHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayHistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayHistoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class PlayHistoryViewHolder(private val binding: ListItemPlayHistoryBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(uiModel: PlayHistoryUiModel) {
        binding.uiModel = uiModel
    }
}