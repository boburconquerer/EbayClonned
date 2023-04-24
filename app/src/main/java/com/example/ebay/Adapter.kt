package com.example.ebay

import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var list: ArrayList<Model>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item1, parent, false)
            return StoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: Model = list[position]
        if(holder is StoryViewHolder){
            holder.text.text = model.title
            holder.image.setImageResource(model.image)

        }

    }

    inner class StoryViewHolder(view: View): RecyclerView.ViewHolder(view){
        var text: TextView = view.findViewById(R.id.text)
        var image: ImageView = view.findViewById(R.id.image)
    }



}