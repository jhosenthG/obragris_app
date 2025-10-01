package com.example.obragrisapp.presentation.navigation

sealed class NavigationEvents {
    object NavigationToLogin : NavigationEvents()
    object NavigationToHome : NavigationEvents()
    object NavigationToProject : NavigationEvents()
    object NavigationToReport : NavigationEvents()
    object NavigationToUser : NavigationEvents()
    object NavigationToBack : NavigationEvents()
}