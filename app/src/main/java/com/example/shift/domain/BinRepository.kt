package com.example.shift.domain

import com.example.shift.data.network.modal.AnswerDto
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.Response

interface BinRepository {

    suspend fun searchUseCase (bin: Int) : InfoItem

    fun getItemUseCase (bin: Int) : Flow<List<InfoItem>>

    fun gelListBinUseCase () : Flow<List<InfoItem>>
}