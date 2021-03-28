package com.example.app_planejou

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OfferAdapter(private val listOffer: MutableList<Offers> ) : RecyclerView.Adapter<OfferAdapter.OfferHolder>() {

    class OfferHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.imgItemPackages)
        val details: TextView = view.findViewById(R.id.txtDetailsPackages)
        val price: TextView = view.findViewById(R.id.txtPricePackages)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_packages, parent, false)
        return OfferHolder(view)
    }

    override fun onBindViewHolder(holder: OfferHolder, position: Int) {
        holder.image.setImageResource(listOffer[position].image)
        holder.details.text = listOffer[position].details
        holder.price.text = listOffer[position].price.toString()

        holder.itemView.setOnClickListener {


        }

    }

    override fun getItemCount(): Int {
        return listOffer.size
    }


}