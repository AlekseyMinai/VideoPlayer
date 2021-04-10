package com.alexey.minay.videoplayer.videoplayer.presentation

import com.alexey.minay.videoplayer.videoplayer.domain.VideoRepository

class VideoPlayerReducer(
    private val videoRepository: VideoRepository,
    private val store: VideoPlayerStore
) {

    fun action(intent: VideoPlayerIntent) = when (intent) {
        is VideoPlayerIntent.GetVideoInfo -> store.state = store.state.copy(
            video = videoRepository.getVideo(intent.id)?.toState()
        )
    }

}