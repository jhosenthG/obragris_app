package com.example.obragrisapp.presentation.navigation

sealed class NavEvents {
    object NavToLogin : NavEvents()
    object NavToHome : NavEvents()
    object NavToProject : NavEvents()
    object NavToReport : NavEvents()
    object NavToUser : NavEvents()
    object NavToBack : NavEvents()
}