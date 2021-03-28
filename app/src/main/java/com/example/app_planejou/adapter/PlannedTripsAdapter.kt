package com.example.app_planejou.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.R
import com.example.app_planejou.model.Offers
import com.example.app_planejou.model.PlannedTrips

class PlannedTripsAdapter(private val listOffer: MutableList<PlannedTrips> ) : RecyclerView.Adapter<PlannedTripsAdapter.PlannedTripsHolder>() {

    class PlannedTripsHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.imgItemPlannedTrips)
        val details: TextView = view.findViewById(R.id.txtDetailsPlannedTrips)
        val price: TextView = view.findViewById(R.id.txtPricePlannedTrips)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlannedTripsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_planned_trips, parent, false)
        return PlannedTripsHolder(view)
    }

    override fun onBindViewHolder(holder: PlannedTripsHolder, position: Int) {
        holder.image.setImageResource(listOffer[position].image)
        holder.details.text = listOffer[position].details
        holder.price.text = "${listOffer[position].time} meses"

        holder.itemView.setOnClickListener {


        }

    }

    override fun getItemCount(): Int {
        return listOffer.size
    }


}