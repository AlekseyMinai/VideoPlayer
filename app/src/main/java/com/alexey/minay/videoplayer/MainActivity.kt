package com.alexey.minay.videoplayer

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.alexey.minay.videoplayer.videoplayer.VideoPlayer
import com.alexey.minay.videoplayer.videoplayer.domain.VideoRepository
import com.alexey.minay.videoplayer.videoplayer.presentation.VideoPlayerReducer
import com.alexey.minay.videoplayer.videoplayer.presentation.VideoPlayerStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val store = remember { mutableStateOf(VideoPlayerStore()) }
                val reducer = remember {
                    mutableStateOf(VideoPlayerReducer(VideoRepository(), store.value))
                }
                VideoPlayer(store.value, reducer.value)
            }
        }
    }
}
