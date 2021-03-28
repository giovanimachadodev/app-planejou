package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewHotel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_hotel)
        supportActionBar?.hide()
    }
}