package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Offer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        val rvOffer = findViewById<RecyclerView>(R.id.rvOffer)
        val adapterProdutos = OfferAdapter(listOffer)
        rvOffer.adapter = adapterProdutos


        rvOffer.layoutManager = LinearLayoutManager(this)

    }

    companion object{
        val listOffer = mutableListOf(
            Offers( R.drawable.finlandia, "Teste", 2000.0 ),
            Offers( R.drawable.finlandia, "Teste", 2000.0 ),
            Offers( R.drawable.finlandia, "Teste", 2000.0 )
        )
    }
}


