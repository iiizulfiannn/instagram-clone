package com.luckyfriday.instagramclone.models

data class HomePostModel(
    val profileImage: Int,
    val contentImage: Int,
    val username: String,
    val description: String,
    val likedList: String,
    val contentDescription: String,
    val totalComments: Int
)
