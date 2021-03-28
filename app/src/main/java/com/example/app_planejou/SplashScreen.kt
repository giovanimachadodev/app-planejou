package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash_screen)
        splash()
    }

    fun splash() {
        Handler(
            Looper.getMainLooper()).postDelayed({
            val proximaTela =
                Intent(this, MainActivity::class.java)
            startActivity(proximaTela)
            finish()
        }, 3000)}
}