package com.example.jetsnack.model

import androidx.compose.runtime.Immutable
import com.example.jetsnack.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

/**
 * A fake repo for searching.
 */
object SearchRepo {
    fun getCategories(): List<SearchCategoryCollection> = searchCategoryCollections
    fun getSuggestions(): List<SearchSuggestionGroup> = searchSuggestions

    suspend fun search(query: String): List<Snack> = withContext(Dispatchers.Default) {
        delay(200L) // simulate an I/O delay
        snacks.filter { it.name.contains(query, ignoreCase = true) }
    }
}

@Immutable
data class SearchCategoryCollection(
    val id: Long,
    val name: String,
    val categories: List<SearchCategory>
)

@Immutable
data class SearchCategory(
    val name: String,
    val imageRes: Int
)

@Immutable
data class SearchSuggestionGroup(
    val id: Long,
    val name: String,
    val suggestions: List<String>
)

/**
 * Static data
 */

private val searchCategoryCollections = listOf(
    SearchCategoryCollection(
        id = 0L,
        name = "Categories",
        categories = listOf(
            SearchCategory(
                name = "AI-Powered",
                imageRes = R.drawable.moxie,
            ),
            SearchCategory(
                name = "Autonomous",
                imageRes = R.drawable.arduinouno,
            ),
            SearchCategory(
                name = "Collaborative",
                imageRes = R.drawable.robotic_arm,
            ),
            SearchCategory(
                name = "Humanoid",
                imageRes = R.drawable.optimus,
            )
        )
    ),
    SearchCategoryCollection(
        id = 1L,
        name = "Parts",
        categories = listOf(
            SearchCategory(
                name = "AI Components",
                imageRes = R.drawable.raspberry_pi4,
            ),
            SearchCategory(
                name = "Hardware",
                imageRes = R.drawable.esp32,
            ),
            SearchCategory(
                name = "Software",
                imageRes = R.drawable.wearable_exoskeleton_leg,
            ),
            SearchCategory(
                name = "Accessories",
                imageRes = R.drawable.robot_wheels,
            ),
            SearchCategory(
                name = "Industrial",
                imageRes = R.drawable.pipico,
            ),
            SearchCategory(
                name = "Premium",
                imageRes = R.drawable.arduinouno,
            )
        )
    )
)

private val searchSuggestions = listOf(
    SearchSuggestionGroup(
        id = 0L,
        name = "Recent searches",
        suggestions = listOf(
            "Cheese",
            "Apple Sauce"
        )
    ),
    SearchSuggestionGroup(
        id = 1L,
        name = "Popular searches",
        suggestions = listOf(
            "Organic",
            "Gluten Free",
            "Paleo",
            "Vegan",
            "Vegitarian",
            "Whole30"
        )
    )
)
