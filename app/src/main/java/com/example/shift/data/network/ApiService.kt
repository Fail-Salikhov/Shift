package com.example.shift.data.network

import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.InfoItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiService {

    @GET("{bin}")
    suspend fun getResultSearch (
        @Path("bin")
            bin : Int
    ) : AnswerDto

}