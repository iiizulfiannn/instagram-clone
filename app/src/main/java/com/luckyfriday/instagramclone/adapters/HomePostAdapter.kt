package com.luckyfriday.instagramclone.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.R
import com.luckyfriday.instagramclone.models.HomePostModel
import com.luckyfriday.instagramclone.models.HomeStoryModel

class HomePostAdapter(
    private val list: List<HomePostModel>
) : RecyclerView.Adapter<HomePostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cell_home_post, parent, false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.profileImageView.setImageResource(item.profileImage)
        holder.contentImageView.setImageResource(item.contentImage)
        holder.usernameTextView.text = item.username
        holder.descriptionTextView.text = item.description
        holder.likedListTextView.text = item.likedList
        holder.contentDescriptionTextView.text = item.contentDescription
        holder.commentsTextView.text = holder.commentsTextView.context.getString(
            R.string.home_see_all_comments,
            item.totalComments.toString()
        )
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImageView: ImageView = itemView.findViewById(R.id.iv_image_profile)
        val contentImageView: ImageView = itemView.findViewById(R.id.iv_content)
        val usernameTextView: TextView = itemView.findViewById(R.id.tv_username)
        val descriptionTextView: TextView = itemView.findViewById(R.id.tv_description)
        val likedListTextView: TextView = itemView.findViewById(R.id.tv_liked_list)
        val contentDescriptionTextView: TextView = itemView.findViewById(R.id.tv_user_post)
        val commentsTextView: TextView = itemView.findViewById(R.id.tv_user_comments)
    }
}