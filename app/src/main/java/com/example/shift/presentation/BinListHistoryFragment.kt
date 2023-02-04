package com.example.shift.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shift.R
import com.example.shift.databinding.FragmentHistoryBinding
import com.example.shift.presentation.adapter.BinListAdapter

class BinListHistoryFragment : Fragment(R.layout.fragment_history) {

    private var _binding : FragmentHistoryBinding? = null
    private val binding : FragmentHistoryBinding
    get() = checkNotNull(_binding)

    private lateinit var viewModal: BinViewModal

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = BinListAdapter()
        binding.rvHistory.adapter = adapter
        viewModal = ViewModelProvider(this)[BinViewModal::class.java]
        viewModal.binHistoryList.observe(viewLifecycleOwner){
            adapter.submitList(it)
        }
    }
}