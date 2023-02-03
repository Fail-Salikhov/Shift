package com.example.shift.data.network.modal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AnswerDto(
    @SerializedName("number")
    @Expose
    val number: Number,
    @SerializedName("scheme")
    @Expose
    val scheme: String,
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("brand")
    @Expose
    val brand: String,
    @SerializedName("prepaid")
    @Expose
    val prepaid: Boolean,
    @SerializedName("country")
    @Expose
    val country: Country,

    @SerializedName("bank")
    @Expose
    val bank: Bank
)

data class Number(
    @SerializedName("length")
    @Expose
    val length: Int,
    @SerializedName("luhn")
    @Expose
    val luhn: Boolean
)

data class Country(
    @SerializedName("numeric")
    @Expose
    val numeric: String,
    @SerializedName("alpha2")
    @Expose
    val alpha2: String,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("emoji")
    @Expose
    val emoji: String,
    @SerializedName("currency")
    @Expose
    val currency: String,
    @SerializedName("latitude")
    @Expose
    val latitude : Int,
    @SerializedName("longitude")
    @Expose
    val longitude: Int
)

data class Bank(
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("url")
    @Expose
    val url: String,
    @SerializedName("phone")
    @Expose
    val phone: String,
    @SerializedName("city")
    @Expose
    val city: String,
)
