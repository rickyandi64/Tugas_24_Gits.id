package com.example.tugas_24

import com.example.tugas_24.model.Item

interface ISalatView {
    fun onDataCompleteFromApi(salat: Item)
    fun onDataErrorFromApi(throwable:Throwable)

}