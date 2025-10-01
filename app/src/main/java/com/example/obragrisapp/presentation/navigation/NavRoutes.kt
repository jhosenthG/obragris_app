package com.example.obragrisapp.presentation.navigation

sealed class NavRoutes(val routes: String) {
    object Login : NavRoutes("login")
    object Home : NavRoutes("home")
    object Project : NavRoutes("project")
    object Report : NavRoutes("report")
    object User : NavRoutes("user")
}