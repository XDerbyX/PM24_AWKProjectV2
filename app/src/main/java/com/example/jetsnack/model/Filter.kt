package com.example.jetsnack.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.SortByAlpha
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector

@Stable
class Filter(
    val name: String,
    enabled: Boolean = false,
    val icon: ImageVector? = null
) {
    val enabled = mutableStateOf(enabled)
}

val filters = listOf(
    Filter(name = "AI-Powered"),
    Filter(name = "Autonomous"),
    Filter(name = "Collaborative"),
    Filter(name = "Humanoid"),
    Filter(name = "Industrial")
)
val priceFilters = listOf(
    Filter(name = "Low Budget"),
    Filter(name = "Mid-range"),
    Filter(name = "High-end"),
    Filter(name = "Premium")
)
val sortFilters = listOf(
    Filter(name = "Android's favorite (default)", icon = Icons.Filled.Android),
    Filter(name = "Rating", icon = Icons.Filled.Star),
    Filter(name = "Alphabetical", icon = Icons.Filled.SortByAlpha)
)

val categoryFilters = listOf(
    Filter(name = "AI Components"),
    Filter(name = "Hardware"),
    Filter(name = "Software"),
    Filter(name = "Accessories")
)
val lifeStyleFilters = listOf(
    Filter(name = "AI-Powered"),
    Filter(name = "Autonomous"),
    Filter(name = "Collaborative"),
    Filter(name = "Humanoid"),
    Filter(name = "Industrial")
)

var sortDefault = sortFilters.get(0).name
