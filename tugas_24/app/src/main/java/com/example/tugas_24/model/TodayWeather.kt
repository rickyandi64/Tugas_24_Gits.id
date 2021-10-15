package com.example.tugas_24.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class TodayWeather(
    val pressure: String, // 1007
    val temperature: String // 11
)