@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.example.jetsnack.ui.home

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetsnack.model.Filter
import com.example.jetsnack.model.Collection
import com.example.jetsnack.model.SnackRepo
import com.example.jetsnack.ui.components.FilterBar
import com.example.jetsnack.ui.components.JetsnackDivider
import com.example.jetsnack.ui.components.JetsnackSurface
import com.example.jetsnack.ui.components.RobotCollection
import com.example.jetsnack.ui.theme.JetsnackTheme

@Composable
fun Feed(
    onClick: (Long, String) -> Unit,
    modifier: Modifier = Modifier
) {
    val robotCollections = remember { SnackRepo.getSnacks() }
    val filters = remember { SnackRepo.getFilters() }
    Feed(
        robotCollections,
        filters,
        onClick,
        modifier
    )
}

@Composable
private fun Feed(
    collections: List<Collection>,
    filters: List<Filter>,
    onClick: (Long, String) -> Unit,
    modifier: Modifier = Modifier
) {
    JetsnackSurface(modifier = modifier.fillMaxSize()) {
        var filtersVisible by remember {
            mutableStateOf(false)
        }
        SharedTransitionLayout {
            Box {
                SnackCollectionList(
                    collections,
                    filters,
                    filtersVisible = filtersVisible,
                    onFiltersSelected = {
                        filtersVisible = true
                    },
                    sharedTransitionScope = this@SharedTransitionLayout,
                    onClick = onClick
                )
                DestinationBar()
                AnimatedVisibility(filtersVisible, enter = fadeIn(), exit = fadeOut()) {
                    FilterScreen(
                        animatedVisibilityScope = this@AnimatedVisibility,
                        sharedTransitionScope = this@SharedTransitionLayout
                    ) { filtersVisible = false }
                }
            }
        }
    }
}

@Composable
private fun SnackCollectionList(
    collections: List<Collection>,
    filters: List<Filter>,
    filtersVisible: Boolean,
    onFiltersSelected: () -> Unit,
    onClick: (Long, String) -> Unit,
    sharedTransitionScope: SharedTransitionScope,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        item {
            Spacer(
                Modifier.windowInsetsTopHeight(
                    WindowInsets.statusBars.add(WindowInsets(top = 56.dp))
                )
            )
            FilterBar(
                filters,
                sharedTransitionScope = sharedTransitionScope,
                filterScreenVisible = filtersVisible,
                onShowFilters = onFiltersSelected
            )
        }
        itemsIndexed(collections) { index, robotCollection ->
            if (index > 0) {
                JetsnackDivider(thickness = 2.dp)
            }

            RobotCollection(
                collection = robotCollection,
                onClick = onClick,
                index = index
            )
        }
    }
}

@Preview("default")
@Preview("dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview("large font", fontScale = 2f)
@Composable
fun HomePreview() {
    JetsnackTheme {
        Feed(onClick = { _, _ -> })
    }
}
