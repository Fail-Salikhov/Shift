package com.example.shift.data

import com.example.shift.data.database.BinDbModal
import com.example.shift.data.database.BinInfoDAO
import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.InfoItem

class Mapper {

    fun mapAnswerDtoToInfoItem (binSearch : Int, answerDto : AnswerDto) : InfoItem{
        return InfoItem(
            bin = binSearch,
            brand = answerDto.brand,
            type = answerDto.type,
            country = answerDto.country.name,
            bank = answerDto.bank.name,
            url = answerDto.bank.url,
            phone = answerDto.bank.phone)
    }

    fun mapInfoItemToBinDbModal (infoItem: InfoItem) : BinDbModal{
        return BinDbModal(
            bin = infoItem.bin,
        brand = infoItem.brand,
        type = infoItem.type,
        country = infoItem.country,
        bank = infoItem.bank,
        url = infoItem.url,
        phone = infoItem.phone
        )
    }

    fun mapBinDbModalToInfoItem (binDb: BinDbModal) : InfoItem{
        return InfoItem(
            bin = binDb.bin,
            brand = binDb.brand,
            type = binDb.type,
            country = binDb.country,
            bank = binDb.bank,
            url = binDb.url,
            phone = binDb.phone
        )
    }
}