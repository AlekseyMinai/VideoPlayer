package com.alexey.minay.videoplayer.videoplayer.presentation

import com.alexey.minay.videoplayer.videoplayer.domain.Comment
import com.alexey.minay.videoplayer.videoplayer.domain.Video

fun Video.toState() = VideoState(
    url = url,
    title = title,
    id = uid
)

fun List<Comment>.toState() = map(Comment::toState)

fun Comment.toState() = CommentState(
    name = name,
    text = text,
    avatarUrl = avatarUrl
)