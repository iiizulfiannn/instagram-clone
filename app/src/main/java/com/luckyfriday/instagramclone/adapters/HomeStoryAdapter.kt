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
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return if (list[position].isLive) 0 else 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            0 -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.cell_home_live, parent, false
                )
                LiveViewHolder(view)
            }

            else -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.cell_home_story, parent, false
                )
                ViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        when (holder.itemViewType) {
            0 -> {
                (holder as LiveViewHolder).apply {
                    profileImage.setImageResource(item.image)
                    nameTextView.text = item.name
                }
            }
            else -> {
                holder as ViewHolder
                holder.profileImage.setImageResource(item.image)
                holder.nameTextView.text = item.name
                if (position == 0) holder.addStoryIcon.visibility = View.VISIBLE
                else holder.addStoryIcon.visibility = View.GONE
            }
        }

    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.iv_home_story)
        val addStoryIcon: ImageView = itemView.findViewById(R.id.iv_add_story)
        val nameTextView: TextView = itemView.findViewById(R.id.tv_home_story_name)
    }

    class LiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.iv_home_live)
        val nameTextView: TextView = itemView.findViewById(R.id.tv_home_live_name)
    }
}