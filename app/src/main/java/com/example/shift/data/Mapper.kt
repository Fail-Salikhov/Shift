package com.example.shift.data

import com.example.shift.data.network.modal.AnswerDto
import com.example.shift.domain.InfoItem

class Mapper {

    fun mapAnswerDtoToInfoItem (answerDto : AnswerDto) : InfoItem{
        return InfoItem(
            bin = 0,
            brand = answerDto.brand,
            type = answerDto.type,
            country = answerDto.country.name,
            bank = answerDto.bank.name,
            url = answerDto.bank.url,
            phone = answerDto.bank.phone)
    }
}