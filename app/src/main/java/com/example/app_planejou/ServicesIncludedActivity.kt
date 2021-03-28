package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.adapter.AdditionalAdapter
import com.example.app_planejou.model.AdditionalServices

class ServicesIncludedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_services_included)

        val rvAdditionalServices = findViewById<RecyclerView>(R.id.additionaList)
        val rvAdditionalAdapter = AdditionalAdapter(servicesIncludedlist)
        val btnComprarPacote : Button = findViewById(R.id.btnComprarPacote)
        rvAdditionalServices.adapter = rvAdditionalAdapter
        rvAdditionalServices.layoutManager = LinearLayoutManager(this)

        btnComprarPacote.setOnClickListener {
            val telaRedirecionar = Intent(this, RedirectSmilesActivity::class.java)
            startActivity(telaRedirecionar)
        }
    }

    companion object{
       val servicesIncludedlist = mutableListOf<AdditionalServices>(
           AdditionalServices("Comprar ingressos\nde atrações e parques"),
           AdditionalServices("Usar Uber"),
           AdditionalServices("Viaje fácil"),
           AdditionalServices("Comprar milhas")
       )
    }
}