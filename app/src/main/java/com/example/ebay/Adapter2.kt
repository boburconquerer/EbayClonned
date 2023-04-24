package com.example.ebay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter2(var list2: ArrayList<Model2>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model2: Model2 = list2[position]
        if(holder is GridViewHolder){
            holder.text2.text = model2.text2
            holder.image2.setImageResource(R.drawable.iphone)
        }
    }

    inner class GridViewHolder(view: View): RecyclerView.ViewHolder(view){
        var text2: TextView = view.findViewById(R.id.text2)
        var image2: ShapeableImageView = view.findViewById(R.id.image2)
    }
}