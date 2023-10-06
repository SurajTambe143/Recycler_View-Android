package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ScrollListAdapter(private val list:ArrayList<ScrollContent>): RecyclerView.Adapter<ScrollListAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var img=itemView.findViewById<ImageView>(R.id.profile_photo)
        var name=itemView.findViewById<TextView>(R.id.profile_name)
        var about=itemView.findViewById<TextView>(R.id.profile_about)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view =inflater.inflate(R.layout.scroll_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.img.setImageResource(list[position].image)
        holder.name.text=list[position].name
        holder.about.text=list[position].about
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}