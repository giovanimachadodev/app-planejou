package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.adapter.OfferAdapter
import com.example.app_planejou.adapter.PlannedTripsAdapter
import com.example.app_planejou.model.Offers
import com.example.app_planejou.model.PlannedTrips

class PlannedTripsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planned_trips)
        supportActionBar?.hide()

        val rvOffer = findViewById<RecyclerView>(R.id.rvPlannedTrips)
        val adapterProdutos = PlannedTripsAdapter(listPlannedTrips)
        rvOffer.adapter = adapterProdutos


        rvOffer.layoutManager = LinearLayoutManager(this)
    }

    companion object{
        val listPlannedTrips = mutableListOf(
            PlannedTrips( R.drawable.finlandia, "Destino: Finlândia\nHotel: Arctic \nLocação: Localiza", 10 ),
            PlannedTrips( R.drawable.minas, "Destino: Holanda\nHotel: Future \nLocação: Localiza", 5 ),
            PlannedTrips( R.drawable.utah, "Destino: Utah\nHotel: Generation \nLocação: Localiza", 3)
        )
    }
}