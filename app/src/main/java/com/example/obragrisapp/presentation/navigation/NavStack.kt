package com.example.obragrisapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.obragrisapp.presentation.screen.home.HomeScreen
import com.example.obragrisapp.presentation.screen.login.LoginScreen

@Composable
fun navStack(navControler: NavHostController) {
    NavHost(navControler, startDestination = NavRoutes.Login.routes) {
        composable(NavRoutes.Login.routes) {
            LoginScreen(
                onLoginSuccess = {
                    navControler.navigate(NavRoutes.Login.routes) {
                        popUpTo(NavRoutes.Login.routes) { inclusive = true }
                    }
                    composable(NavRoutes.Home.routes) {
                        HomeScreen(navControler)
                    }
                    composable(NavRoutes.Project.routes) {

                    }
                    composable(NavRoutes.Report.routes) {

                    }
                    composable(NavRoutes.User.routes) {

                    }
                }
            )
        }
    }
}