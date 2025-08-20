package com.luckyfriday.instagramclone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.R
import com.luckyfriday.instagramclone.models.HomeStoryModel

class HomeStoryAdapter(
    private val list: List<HomeStoryModel>
) : RecyclerView.Adapter<HomeStoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cell_home_story, parent, false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.profileImage.setImageResource(item.image)
        holder.nameTextView.text = item.name
        if (position == 0) holder.addStoryIcon.visibility = View.VISIBLE
        else holder.addStoryIcon.visibility = View.GONE
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.iv_home_story)
        val addStoryIcon: ImageView = itemView.findViewById(R.id.iv_add_story)
        val nameTextView: TextView = itemView.findViewById(R.id.tv_home_story_name)
    }
}