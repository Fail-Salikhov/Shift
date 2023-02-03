package com.example.shift.domain

class GetItemUseCase (private val binRepository: BinRepository) {

    operator fun invoke (bin: Int) = binRepository.getItemUseCase(bin)
}