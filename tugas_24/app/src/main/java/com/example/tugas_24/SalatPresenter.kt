package com.example.tugas_24

import android.content.Context
import com.example.tugas_24.model.Item
import com.example.tugas_24.model.solat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SalatPresenter (context: Context) {

val salatView = context as ISalatView

    fun getDataFromApi(city: String){
        RetrofitService.create()
            .getApi(city)
            .enqueue(object : Callback<solat>{
                override fun onResponse(call: Call<solat>, response: Response<solat>) {
                    salatView.onDataCompleteFromApi(response.body()?.items?.get(0) as Item)
                }

                override fun onFailure(call: Call<solat>, t: Throwable) {
                    salatView.onDataErrorFromApi(t)
                }

            })
    }
}