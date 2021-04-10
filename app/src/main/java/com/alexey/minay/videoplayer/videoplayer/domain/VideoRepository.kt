package com.alexey.minay.videoplayer.videoplayer.domain

class VideoRepository {

    fun getVideo(id: String) = FakeData.getVideo(id)

}