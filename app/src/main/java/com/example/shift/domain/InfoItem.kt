package com.example.shift.domain

data class InfoItem(
    var bin : Int = NON_ID,
    val brand : String?,
    val type : String?,
    val country : String?,
    val bank : String?,
    val url : String?,
    val phone : String?
){
    companion object{
        const val NON_ID = 0
    }
}
