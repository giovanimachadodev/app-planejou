package com.example.app_planejou.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.DetailedOffer
import com.example.app_planejou.R
import com.example.app_planejou.model.Offers
import com.google.android.material.internal.ContextUtils.getActivity

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
        holder.price.text = "R$ ${listOffer[position].price}"

        holder.itemView.setOnClickListener {
            val novaTela = Intent(it.context, DetailedOffer::class.java)
            it.context.startActivity(novaTela)
        }

    }

    override fun getItemCount(): Int {
        return listOffer.size
    }

}