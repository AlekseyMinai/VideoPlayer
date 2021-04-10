package com.alexey.minay.videoplayer.videoplayer.presentation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class VideoPlayerStore(
    videoPlayerState: VideoPlayerState = VideoPlayerState()
) {

    private val mVideoPlayerState = MutableStateFlow(videoPlayerState)
    val videoPlayerState: StateFlow<VideoPlayerState> = mVideoPlayerState.asStateFlow()

    var state: VideoPlayerState
        set(value) {
            mVideoPlayerState.tryEmit(value)
        }
        get() = mVideoPlayerState.value

}