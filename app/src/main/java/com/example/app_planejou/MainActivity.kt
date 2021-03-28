package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnPlanejar : TextView = findViewById(R.id.btn_planning)
        val btnMeusSonhos: TextView = findViewById(R.id.btn_my_dreams)


        btnPlanejar.setOnClickListener {
            val telaPlanejar = Intent(this, Planning::class.java)
            startActivity(telaPlanejar)
        }

        btnMeusSonhos.setOnClickListener {
            val telaMeusSonhos = Intent(this, PlannedTripsActivity::class.java)
            startActivity(telaMeusSonhos)
        }

    }


}