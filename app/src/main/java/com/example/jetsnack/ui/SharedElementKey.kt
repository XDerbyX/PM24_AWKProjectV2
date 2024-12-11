package com.example.jetsnack.ui

data class RobotSharedElementKey(
    val snackId: Long,
    val origin: String,
    val type: sharedElementType
)

enum class sharedElementType {
    Bounds,
    Image,
    Title,
    Tagline,
    Background
}

object FilterSharedElementKey
