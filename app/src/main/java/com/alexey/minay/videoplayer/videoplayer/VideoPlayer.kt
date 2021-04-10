package com.alexey.minay.videoplayer.videoplayer

import android.net.Uri
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.alexey.minay.videoplayer.videoplayer.presentation.VideoPlayerIntent
import com.alexey.minay.videoplayer.videoplayer.presentation.VideoPlayerReducer
import com.alexey.minay.videoplayer.videoplayer.presentation.VideoPlayerStore
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

@Composable
fun VideoPlayer(
    store: VideoPlayerStore,
    reducer: VideoPlayerReducer
) {
    val context = LocalContext.current
    val state by store.videoPlayerState.collectAsState()

    val exoplayer by remember {
        mutableStateOf(SimpleExoPlayer.Builder(context).build())
    }
    val dataSourceFactory = DefaultDataSourceFactory(
        context,
        Util.getUserAgent(context, context.packageName)
    )
    val uri = Uri.parse(state.video?.url)
    val source = ProgressiveMediaSource.Factory(dataSourceFactory)
        .createMediaSource(uri)
    exoplayer.prepare(source)

    AndroidView(
        factory = {
            PlayerView(it).apply {
                useController = false
                player = exoplayer
                player?.playWhenReady = true
            }
        }
    )
    reducer.action(VideoPlayerIntent.GetVideoInfo("1"))
}
