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
                imageRes = R.drawable.chips
            ),
            SearchCategory(
                name = "Autonomous",
                imageRes = R.drawable.fruit,
            ),
            SearchCategory(
                name = "Collaborative",
                imageRes = R.drawable.desserts
            ),
            SearchCategory(
                name = "Humanoid",
                imageRes = R.drawable.nuts,
            )
        )
    ),
    SearchCategoryCollection(
        id = 1L,
        name = "Parts",
        categories = listOf(
            SearchCategory(
                name = "AI Components",
                imageRes = R.drawable.organic
            ),
            SearchCategory(
                name = "Hardware",
                imageRes = R.drawable.gluten_free
            ),
            SearchCategory(
                name = "Software",
                imageRes = R.drawable.paleo,
            ),
            SearchCategory(
                name = "Accessories",
                imageRes = R.drawable.vegan,
            ),
            SearchCategory(
                name = "Industrial",
                imageRes = R.drawable.organic,
            ),
            SearchCategory(
                name = "Premium",
                imageRes = R.drawable.paleo
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
