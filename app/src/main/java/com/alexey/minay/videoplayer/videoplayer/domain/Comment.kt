package com.alexey.minay.videoplayer.videoplayer.domain

data class Comment(
    val videoId: String,
    val avatarUrl: String,
    val name: String,
    val text: String
)