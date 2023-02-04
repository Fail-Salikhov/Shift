package com.example.shift.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shift.domain.InfoItem

@Entity(tableName = "bin_item")
data class BinDbModal (

    @PrimaryKey
    val bin : Int = InfoItem.NON_ID,
    val brand : String?,
    val type : String?,
    val country : String?,
    val bank : String?,
    val url : String?,
    val phone : String?
    )