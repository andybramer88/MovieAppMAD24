package com.example.movieappmad24.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.movieappmad24.navigation.Screen

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomBarScreen(
        route = Screen.HomeScreen.route,
        title = "Home",
        icon = Icons.Filled.Home
    )

    object Watchlist: BottomBarScreen(
        route = Screen.WatchlistScreen.route,
        title = "Watchlist",
        icon = Icons.Filled.Star
    )
}