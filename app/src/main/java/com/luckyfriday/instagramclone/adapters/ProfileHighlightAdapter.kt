package com.luckyfriday.instagramclone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.models.ProfileHighlightModel
import com.luckyfriday.instagramclone.R

class ProfileHighlightAdapter(
    private val list: List<ProfileHighlightModel>
) : RecyclerView.Adapter<ProfileHighlightAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cell_profile_highlight, parent, false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.highlightImageView.setImageResource(item.image)
        holder.nameTextView.text = item.name
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val highlightImageView: ImageView = itemView.findViewById(R.id.iv_profile_highlight)
        val nameTextView: TextView = itemView.findViewById(R.id.tv_profile_highlight_name)
    }

}