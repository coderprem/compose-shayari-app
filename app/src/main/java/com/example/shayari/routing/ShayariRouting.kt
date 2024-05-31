package com.example.shayari.routing

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shayari.CategoryScreen
import com.example.shayari.DetailScreen
import com.example.shayari.ListScreen
import com.example.shayari.SplashScreen

@Composable
fun ShayariRouting(navHostController: NavHostController,modifier: Modifier = Modifier) {

    NavHost(navController = navHostController, startDestination = RoutingItem.SplashScreen.route) {
        composable(RoutingItem.SplashScreen.route) {
            SplashScreen(navHostController = navHostController)
        }
        composable(RoutingItem.CategoryScreen.route) {
             CategoryScreen(navHostController = navHostController)
        }
        composable(RoutingItem.ListScreen.route+ "/{category}") {
            val title = it.arguments?.getString("category")
            ListScreen(navHostController = navHostController, title = title?:"")
        }
        composable(RoutingItem.DetailScreen.route+ "/{shayari}") {
            val shayari = it.arguments?.getString("shayari")
            DetailScreen(shayari = shayari?:"")
        }
    }
}