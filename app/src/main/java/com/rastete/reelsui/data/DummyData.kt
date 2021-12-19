package com.rastete.reelsui.data

import android.net.Uri

object DummyData {
    val reels = listOf<Reel>(
        Reel(
            id = 1,
            video = "lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/4.png",
            userName = "Raul Astete",
            isLiked = true,
            likesCount = 778,
            commentsCount = 156,
            comment = "Muy bueno el video"
        ),
        Reel(
            id = 2,
            video = "lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/7.png",
            userName = "Mike Tyson",
            isLiked = true,
            likesCount = 5923,
            commentsCount = 11,
            comment = "No tiene sentido el video"
        ),
        Reel(
            id = 3,
            video = "lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/3.png",
            userName = "Christian Bale",
            isLiked = true,
            likesCount = 2314,
            comment = "Que pedazo de video",
            commentsCount = 200
        )
    )
}

data class Reel(
    val id: Int,
    private val video: String,
    val userImage: String,
    val userName: String,
    val isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int
) {

    fun getVideoUrl(): Uri {
        return Uri.parse("asset:///${video}")
    }

}