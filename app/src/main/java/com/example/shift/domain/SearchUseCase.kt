package com.example.shift.domain

class SearchUseCase (private val binRepository: BinRepository) {

    suspend operator fun invoke (bin: Int) = binRepository.searchUseCase(bin)
}