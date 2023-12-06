package com.example.projux

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projux.screens.HomeScreen
import com.example.projux.screens.PurchaseScreen
import com.example.projux.screens.Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController =  navController, startDestination = Screen.HomeScreen.route) {

        composable(route = Screen.HomeScreen.route) { HomeScreen(navController = navController) }
        composable(route = Screen.PurchaseScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.QrScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.CancelScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.PreAuthorizationScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.ReportScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.CloseScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.HelpScreen.route) { PurchaseScreen(navController = navController) }

    }
}