package com.example.shift.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shift.R
import com.example.shift.databinding.FragmentSearchInfoBinding

class SearchAndInfoFragment : Fragment(R.layout.fragment_search_info) {

    private var _binding : FragmentSearchInfoBinding? = null
    private val binding : FragmentSearchInfoBinding
        get() = checkNotNull(_binding)

    private lateinit var viewModal: BinViewModal

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModal = ViewModelProvider(this)[BinViewModal::class.java]
        viewModal.infoBin.observe(viewLifecycleOwner){
            binding.textViewBrand.text = it.brand
            binding.textViewType.text = it.type
            binding.textViewCountry.text = it.country
            binding.textViewBank.text = it.bank
            binding.textViewUrl.text = it.url
            binding.textViewPhone.text = it.phone
        }
        searchOfBin()
    }

    private fun searchOfBin () {
        binding.buttonSearch.setOnClickListener {
            viewModal.searchForBin(binding.textViewSearchBin.text.toString().toInt())
            Log.d("test", binding.textViewSearchBin.text.toString())
        }

    }
}