package com.alexey.minay.videoplayer.videoplayer.presentation

data class VideoPlayerState(
    val video: VideoState? = VideoState("", "", ""),
    val comments: List<CommentState> = mutableListOf()
)

data class VideoState(
    val id: String,
    val url: String,
    val title: String
)

data class CommentState(
    val avatarUrl: String,
    val name: String,
    val text: String
)
