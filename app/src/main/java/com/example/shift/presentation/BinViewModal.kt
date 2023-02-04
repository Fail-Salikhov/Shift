package com.example.shift.presentation

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shift.domain.InfoItem
import com.example.shift.domain.SearchUseCase
import kotlinx.coroutines.launch
import androidx.lifecycle.asLiveData
import com.example.shift.data.BinRepositoryImpl
import com.example.shift.data.Mapper
import com.example.shift.data.network.ApiFactory
import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.GetItemUseCase
import com.example.shift.domain.GetListBinUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BinViewModal(application: Application) : AndroidViewModel(application) {

    private val repository = BinRepositoryImpl(application)

    private val searchUseCase = SearchUseCase(repository)
    private val getListBinUseCase = GetListBinUseCase(repository)

    private var _infoBin = MutableLiveData<InfoItem>()
    val infoBin: LiveData<InfoItem>
        get() = _infoBin

//    private var _listBin = MutableLiveData<InfoItem>()
//    val listBin: LiveData<InfoItem>
//        get() = _listBin

    fun searchForBin(bin: Int) {
        viewModelScope.launch {
            try {
                _infoBin.value = repository.searchUseCase(bin)
            } catch (e: Exception) {
                Log.d("testErr", e.toString())
            }
        }
    }

    val binHistoryList = repository.gelListBinUseCase().asLiveData()
}