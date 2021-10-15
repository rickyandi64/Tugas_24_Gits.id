package com.example.tugas_24.model


import com.google.gson.annotations.SerializedName

import androidx.annotation.Keep

@Keep
data class solat(
    val address: String,
    val city: String,
    val country: String, // UK
    @SerializedName("country_code")
    val countryCode: String, // GB
    val daylight: String, // 1
    @SerializedName("for")
    val forX: String, // daily
    val items: List<Item>,
    val latitude: String, // 51.508129
    val link: String, // http://muslimsalat.com/london
    val longitude: String, // -0.128005
    @SerializedName("map_image")
    val mapImage: String, // https://maps.google.com/maps/api/staticmap?center=51.508129,-0.128005&sensor=false&zoom=13&size=300x300
    val method: Int, // 5
    @SerializedName("postal_code")
    val postalCode: String,
    @SerializedName("prayer_method_name")
    val prayerMethodName: String, // Muslim World League
    @SerializedName("qibla_direction")
    val qiblaDirection: String, // 119.04
    val query: String, // london
    val sealevel: String, // 14
    val state: String,
    @SerializedName("status_code")
    val statusCode: Int, // 1
    @SerializedName("status_description")
    val statusDescription: String, // Success.
    @SerializedName("status_valid")
    val statusValid: Int, // 1
    val timezone: String, // 0
    val title: String,
    @SerializedName("today_weather")
    val todayWeather: TodayWeather
)