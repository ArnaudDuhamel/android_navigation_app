package com.example.navigation_tutorial.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigation_tutorial.screens.DetailScreen
import com.example.navigation_tutorial.screens.HomeScreen
import com.example.navigation_tutorial.screens.LoginScreen
import androidx.navigation.compose.composable

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route)
    {
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.Detail.route){
            DetailScreen(navController)
        }
    }
}