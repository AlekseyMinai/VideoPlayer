package com.alexey.minay.videoplayer.videoplayer.presentation

sealed class VideoPlayerIntent {
    class GetVideoInfo(val id: String): VideoPlayerIntent()
}