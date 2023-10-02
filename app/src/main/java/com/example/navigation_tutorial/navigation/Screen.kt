package com.example.navigation_tutorial.navigation

sealed class Screens(val route: String) {
    object Login: Screens("login_screen")
    object Home: Screens("home_screen")
    object Detail: Screens("Detail_screen")
}