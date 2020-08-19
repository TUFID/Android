package com.mylaptop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListLaptopAdapter(private val listLaptop: ArrayList<Laptop>) : RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_laptop, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun getItemCount(): Int {
        return listLaptop.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val laptop = listLaptop[position]


        Glide.with(holder.itemView.context)
            .load(laptop.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = laptop.name
        holder.tvDetail.text = laptop.detail
    }


    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }
}