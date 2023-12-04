package com.example.projux

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projux.windows.Home
import com.example.projux.windows.Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController =  navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            Home(navController = navController)
        }
    }
}