package com.luckyfriday.instagramclone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.models.ProfileCollectionModel
import com.luckyfriday.instagramclone.R

class ProfileCollectionAdapter(
    private val list: List<ProfileCollectionModel>
) : RecyclerView.Adapter<ProfileCollectionAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cell_profile_collection, parent, false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.iv_profile_collection)
    }

}