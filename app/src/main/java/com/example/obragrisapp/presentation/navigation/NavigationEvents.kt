package com.example.obragrisapp.presentation.navigation

import java.net.Authenticator

sealed class NavigationEvents {
    data class NavigateToHome(val isAuthenticated: Boolean) : NavigationEvents()
    data class NavigateToUser(val id: String) : NavigationEvents()
    object NavigateToLogin : NavigationEvents()
}