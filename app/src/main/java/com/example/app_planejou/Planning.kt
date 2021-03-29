package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Planning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planning)
        supportActionBar?.hide()

        val btnPesquisarOfertas: Button = findViewById(R.id.btn_ofertas)

        btnPesquisarOfertas.setOnClickListener {
            val telaOfertas = Intent(this, Offer::class.java)
            startActivity(telaOfertas)
        }
    }
}