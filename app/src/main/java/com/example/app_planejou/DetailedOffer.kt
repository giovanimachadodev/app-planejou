package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailedOffer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_offer)
        supportActionBar?.hide()
    }
}