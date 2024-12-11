package com.example.jetsnack.model

import androidx.compose.runtime.Immutable
import kotlin.random.Random

@Immutable
data class Collection(
    val id: Long,
    val name: String,
    val robots: List<Robot>,
    val type: CollectionType = CollectionType.Normal
)

enum class CollectionType { Normal, Highlight }

/**
 * A fake repo
 */
object RobotRepo {
    fun getSnacks(): List<Collection> = collections
    fun getSnack(snackId: Long) = Robots.find { it.id == snackId }!!
    fun getRelated(@Suppress("UNUSED_PARAMETER") snackId: Long) = related
    fun getInspiredByCart() = inspiredByCart
    fun getFilters() = filters
    fun getPriceFilters() = priceFilters
    fun getCart() = cart
    fun getSortFilters() = sortFilters
    fun getCategoryFilters() = categoryFilters
    fun getSortDefault() = sortDefault
    fun getLifeStyleFilters() = lifeStyleFilters
}

/**
 * Static data
 */

private val picks = Collection(
    id = 1L,
    name = "Dzidan's picks",
    type = CollectionType.Highlight,
    robots = Robots.subList(0, 13)
)

private val popular = Collection(
    id = Random.nextLong(),
    name = "Popular on UNHAS",
    robots = Robots.subList(14, 19)
)

private val awkFavs = picks.copy(
    id = Random.nextLong(),
    name = "AWK favourites"
)

private val newlyAdded = popular.copy(
    id = Random.nextLong(),
    name = "Newly Added"
)

private val exclusive = picks.copy(
    id = Random.nextLong(),
    name = "Only on AWK"
)

private val also = picks.copy(
    id = Random.nextLong(),
    name = "Customers also bought"
)

private val inspiredByCart = picks.copy(
    id = Random.nextLong(),
    name = "Inspired by your cart"
)

private val collections = listOf(
    picks,
    popular,
    awkFavs,
    newlyAdded,
    exclusive
)

private val related = listOf(
    also.copy(id = Random.nextLong()),
    popular.copy(id = Random.nextLong())
)

private val cart = listOf(
    OrderLine(Robots[4], 2),
    OrderLine(Robots[6], 3),
    OrderLine(Robots[8], 1)
)

@Immutable
data class OrderLine(
    val robot: Robot,
    val count: Int
)
