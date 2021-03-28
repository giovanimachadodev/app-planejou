package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DetailedOffer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_offer)
        supportActionBar?.hide()

        val btnViewHotel: ImageView = findViewById(R.id.imgBtnViewHotel)
        val btnServicesIncluded: Button = findViewById(R.id.btnServicosAdicionais)
        val btnCalculateBudget: Button = findViewById(R.id.btnFazerOrcamento)

        btnViewHotel.setOnClickListener {
            val telaHotel = Intent(this, ViewHotel::class.java)
            startActivity(telaHotel)
        }

        btnServicesIncluded.setOnClickListener {
            val telaServicosAdicionais = Intent(this, ServicesIncludedActivity::class.java)
            startActivity(telaServicosAdicionais)
        }

        btnCalculateBudget.setOnClickListener {
            val telaFazerOrcamento = Intent(this, CalculateBudget::class.java)
            startActivity(telaFazerOrcamento)
        }
    }
}