package com.alexey.minay.videoplayer.videoplayer.domain

object FakeData {
    val videos = mutableListOf<Video>().apply {
        add(
            Video(
                uid = "1",
                url = "https://firebasestorage.googleapis.com/" +
                        "v0/b/testfirebase-a2d24.appspot.com/o/videos%2F%D0%90%D0%BD%D0%B3%D0%BB%D0" +
                        "%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9%20%D1%8F%D0%B7%D1%8B%D0%BA%20%D1%81%20" +
                        "%D0%BD%D1%83%D0%BB%D1%8F%20%D0%B7%D0%B0%2050%20%D1%83%D1%80%D0%BE%D0%BA%D0" +
                        "%BE%D0%B2%20A0.%20%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%" +
                        "D0%B9%20%D1%81%20%D0%BD%D1%83%D0%BB%D1%8F.%20%20%D0%90%D0%BD%D0%B3%D0%BB%D" +
                        "0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9%20%D0%B4%D0%BB%D1%8F%20%D0%BD%D0%B0%D" +
                        "1%87%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B8%D1%85.%20%D0%A3%D1%80%D0%BE%D0%" +
                        "BA%D0%B8%20%D0%A3%D1%80%D0%BE%D0%BA%201.mp4?alt=media&token=" +
                        "745cf326-06e2-4d95-9eeb-94d8bfc4aca4",
                title = "First video"
            )
        )
        add(
            Video(
                uid = "2",
                url = "https://firebasestorage.googleapis.com/v0/b/" +
                        "testfirebase-a2d24.appspot.com/o/videos%2F%D0%90%D0%BD%D0%B3%D0%BB" +
                        "%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9%20%D1%8F%D0%B7%D1%8B%D0%BA%20%D1" +
                        "%81%20%D0%BD%D1%83%D0%BB%D1%8F%20%D0%B7%D0%B0%2050%20%D1%83%D1%80%D0%BE" +
                        "%D0%BA%D0%BE%D0%B2%20A0%20%20%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81" +
                        "%D0%BA%D0%B8%D0%B9%20%D1%81%20%D0%BD%D1%83%D0%BB%D1%8F%20%20%D0%90%D0%" +
                        "BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9%20%D0%B4%D0%BB%D1%8F" +
                        "%20%D0%BD%D0%B0%D1%87%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B8%D1%85%20%20%" +
                        "D0%A3%D1%80%D0%BE%D0%BA%D0%B8%20%D0%A3%D1%80%D0%BE%D0%BA%202.mp4?alt=" +
                        "media&token=e1d0638b-7e27-4d57-8b99-64e076649110",
                title = "Second video"
            )
        )
    }
    val comments = mutableListOf<Comment>().apply {
        add(
            Comment(
                videoId = "1",
                avatarUrl = "",
                name = "First Name",
                text = "ok"
            )
        )
        add(
            Comment(
                videoId = "1",
                avatarUrl = "",
                name = "Second Name",
                text = "ok"
            )
        )
        add(
            Comment(
                videoId = "2",
                avatarUrl = "",
                name = "Third Name",
                text = "ok"
            )
        )
    }

    fun getVideo(id: String) = videos.firstOrNull { it.uid == id }

    fun getComments(videoId: String) = comments.filter { it.videoId == videoId }

}