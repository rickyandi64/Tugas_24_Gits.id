package com.example.tugas_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugas_24.model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ISalatView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SalatPresenter(this).getDataFromApi("jakarta")
    }

    override fun onDataCompleteFromApi(salat: Item) {
        subuh.text = salat.fajr
        dzuhur.text = salat.dhuhr
        asar.text = salat.asr
        magrib.text = salat.maghrib
        isya.text = salat.isha
    }

    override fun onDataErrorFromApi(throwable: Throwable) {
        error("error ----> ${throwable.localizedMessage}")

    }
}