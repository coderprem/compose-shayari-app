package com.example.shayari.routing

sealed class RoutingItem(val route: String) {
    object SplashScreen : RoutingItem("splash")
    object CategoryScreen : RoutingItem("category")
    object ListScreen : RoutingItem("list")
    object DetailScreen : RoutingItem("detail")
}