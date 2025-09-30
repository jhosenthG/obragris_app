package com.example.obragrisapp.presentation.navigation

sealed class NavigationRoutes(val routes: String) {
    object Login : NavigationRoutes("login")
    object Home : NavigationRoutes("home")
    object Project : NavigationRoutes("project")
    object Report : NavigationRoutes("report")
    object User : NavigationRoutes("user")
}