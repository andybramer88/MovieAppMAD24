package com.example.movieappmad24.navigation

const val DETAIL_ARGUMENT_KEY = "movieId"
sealed class Screen(val route: String) {
    object HomeScreen : Screen("home")
    object DetailScreen : Screen("detail/{$DETAIL_ARGUMENT_KEY}") {
        fun withId(id: String): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id)
        }
    }
    object WatchlistScreen : Screen("watchlist")
}