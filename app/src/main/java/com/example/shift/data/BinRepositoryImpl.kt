package com.example.shift.data

import android.util.Log
import com.example.shift.data.network.ApiFactory
import com.example.shift.data.network.ApiService
import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.BinRepository
import com.example.shift.domain.InfoItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class BinRepositoryImpl (  ): BinRepository{

    private val apiService = ApiFactory.apiService


    override suspend fun searchUseCase(bin: Int) : AnswerDto {
        return apiService.getResultSearch(bin)
    }

    override fun getItemUseCase(bin: Int): Flow<InfoItem> {
        TODO("Not yet implemented")
    }
}