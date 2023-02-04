package com.example.shift.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.shift.databinding.ItemBinBinding
import com.example.shift.domain.InfoItem

class BinListAdapter : ListAdapter<InfoItem, BinListViewHolder>(BinListDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BinListViewHolder {
        val binding = ItemBinBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return BinListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BinListViewHolder, position: Int) {
        val binItem = getItem(position)
        holder.binding.textViewBin.text = binItem.bin.toString()
        holder.binding.textViewBankItem.text = binItem.bank.toString()
        holder.binding.textViewBrand.text = binItem.brand.toString()
        holder.binding.textViewCountry.text = binItem.country.toString()
        holder.binding.textViewType.text = binItem.type.toString()
        holder.binding.textViewUrl.text = binItem.url.toString()
        holder.binding.textViewPhone.text = binItem.phone.toString()
    }
}