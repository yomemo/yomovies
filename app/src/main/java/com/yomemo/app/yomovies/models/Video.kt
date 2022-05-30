package com.yomemo.yomovies.models

data class Video(
    val id: String,
    val name: String,
    val site: String,
    val key: String,
    val size: Int,
    val type: String,
)