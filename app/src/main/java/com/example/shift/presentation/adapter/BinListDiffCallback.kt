package com.example.shift.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.shift.domain.InfoItem

object BinListDiffCallback : DiffUtil.ItemCallback<InfoItem>() {
    override fun areItemsTheSame(oldItem: InfoItem, newItem: InfoItem): Boolean {
        return oldItem.bin == newItem.bin
    }

    override fun areContentsTheSame(oldItem: InfoItem, newItem: InfoItem): Boolean {
        return oldItem == newItem
    }
}