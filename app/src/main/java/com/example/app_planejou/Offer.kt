package com.example.app_planejou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.adapter.OfferAdapter
import com.example.app_planejou.model.Offers

class Offer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)
        supportActionBar?.hide()

        val rvOffer = findViewById<RecyclerView>(R.id.rvOffer)
        val adapterProdutos = OfferAdapter(listOffer)
        val btnFilter: ImageView = findViewById(R.id.imgBtnFiltro)
        rvOffer.adapter = adapterProdutos
        rvOffer.layoutManager = LinearLayoutManager(this)

        btnFilter.setOnClickListener {
            val telaFiltros = Intent(this, FilterActivity::class.java )
            startActivity(telaFiltros)
        }
    }

    companion object{
        val listOffer = mutableListOf(
            Offers( R.drawable.finlandia, "Destino: Finlândia\nHotel: Arctic \nLocação: Localiza", 2000.0 ),
            Offers( R.drawable.minas, "Destino: Holanda\nHotel: Future \nLocação: Localiza", 2000.0 ),
            Offers( R.drawable.utah, "Destino: Utah\nHotel: Generation \nLocação: Localiza", 2000.0 )
        )
    }
}


