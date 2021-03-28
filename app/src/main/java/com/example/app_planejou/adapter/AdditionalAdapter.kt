package com.example.app_planejou.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_planejou.R
import com.example.app_planejou.model.AdditionalServices

class AdditionalAdapter(private val servicesIncludedlist: MutableList<AdditionalServices>) :
    RecyclerView.Adapter<AdditionalAdapter.ServiceHolder>() {


    class ServiceHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.serviceName)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_additional, parent, false)
        return ServiceHolder(view)
    }


    override fun onBindViewHolder(holder: ServiceHolder, position: Int) {

        holder.name.text = servicesIncludedlist[position].name

        holder.itemView.setOnClickListener() {
        }
    }

    override fun getItemCount(): Int = servicesIncludedlist.size
}