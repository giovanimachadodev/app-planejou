package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnPlanejar : TextView = findViewById(R.id.btn_planning)
        val btnMeusSonhos: TextView = findViewById(R.id.btn_my_dreams)
        val btnProximosDestinos: TextView = findViewById(R.id.btn_destinos)
        val btnMilhasDoBem: TextView = findViewById(R.id.btn_milhas_do_bem)
        val btnConfiraPacotes: ImageView = findViewById(R.id.btn_confira_pacotes)
        val btnSos: Button = findViewById(R.id.btn_sos)

        btnPlanejar.setOnClickListener {
            val telaPlanejar = Intent(this, Planning::class.java)
            startActivity(telaPlanejar)
        }

        btnMeusSonhos.setOnClickListener {
            val telaMeusSonhos = Intent(this, PlannedTripsActivity::class.java)
            startActivity(telaMeusSonhos)
        }

        btnConfiraPacotes.setOnClickListener {
            val telaConfiraPacotes= Intent(this, Offer::class.java)
            startActivity(telaConfiraPacotes)
        }

        btnMilhasDoBem.setOnClickListener {
            val telaMilhasDoBem = Intent(this, RedirectSmilesActivity::class.java)
            startActivity(telaMilhasDoBem)
        }

        btnSos.setOnClickListener {
            val telaSOS = Intent(this, MenuSos::class.java)
            startActivity(telaSOS)
        }

        btnProximosDestinos.setOnClickListener {
            val telaProximosDestinos = Intent(this, Destiny::class.java)
            startActivity(telaProximosDestinos)
        }


    }


}