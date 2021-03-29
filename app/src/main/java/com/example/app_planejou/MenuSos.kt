package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.TextView

class MenuSos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_sos)
        supportActionBar?.hide()

        val btnChamarPolicia: TextView = findViewById(R.id.card_police)
        val btnChamarAjuda: TextView = findViewById(R.id.card_sos)

        btnChamarPolicia.setOnClickListener {
            val telaPolicia = Intent(this, CallPolice::class.java)
            startActivity(telaPolicia)
        }

        btnChamarAjuda.setOnClickListener {
            val telaAjuda = Intent(this, EmergencyHelp::class.java)
            startActivity(telaAjuda)
        }
    }
}