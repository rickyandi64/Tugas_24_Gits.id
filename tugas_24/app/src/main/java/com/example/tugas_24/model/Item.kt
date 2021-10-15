package com.example.tugas_24.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Item(
    val asr: String, // 3:33 pm
    @SerializedName("date_for")
    val dateFor: String, // 2021-10-15
    val dhuhr: String, // 12:46 pm
    val fajr: String, // 5:33 am
    val isha: String, // 7:52 pm
    val maghrib: String, // 6:13 pm
    val shurooq: String // 7:18 am
)