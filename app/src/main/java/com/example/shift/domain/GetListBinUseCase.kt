package com.example.shift.domain

class GetListBinUseCase (private val binRepository: BinRepository) {

    operator fun invoke () = binRepository.gelListBinUseCase()
}