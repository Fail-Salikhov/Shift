package com.example.shift.data

import android.app.Application
import android.util.Log
import com.example.shift.data.database.AppDataBase
import com.example.shift.data.network.ApiFactory
import com.example.shift.data.network.ApiService
import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.BinRepository
import com.example.shift.domain.InfoItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class BinRepositoryImpl (private val application: Application): BinRepository{

    private val apiService = ApiFactory.apiService
    private val mapper = Mapper()
    private val binInfoDAO = AppDataBase.getInstance(application).binInfoDao()


    override suspend fun searchUseCase(bin: Int) : InfoItem {
        val item = apiService.getResultSearch(bin)
        var bin = mapper.mapAnswerDtoToInfoItem(bin, item)
        binInfoDAO.insertBin(mapper.mapInfoItemToBinDbModal(bin))
        return bin
    }

    override fun getItemUseCase(bin: Int): Flow<List<InfoItem>> {
        TODO("Not yet implemented")
    }

    override fun gelListBinUseCase(): Flow<List<InfoItem>> {
        return binInfoDAO.binList().map {
            it.map {
                mapper.mapBinDbModalToInfoItem(it)
            }
        }
    }
}