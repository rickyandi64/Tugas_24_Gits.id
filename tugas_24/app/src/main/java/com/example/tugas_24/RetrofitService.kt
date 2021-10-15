package com.example.tugas_24

import com.example.tugas_24.model.solat
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {
    @GET("{city}.json?key=6c348760b435f24a511a380f667bfa7e")
    fun getApi(@Path("city") city: String) : Call<solat>

    companion object{
        fun create(): RetrofitService{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://muslimsalat.com")
                .build()
            return retrofit.create(RetrofitService::class.java)
        }
    }
}