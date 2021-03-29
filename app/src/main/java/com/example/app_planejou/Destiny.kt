package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Destiny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_destiny)
    }
}