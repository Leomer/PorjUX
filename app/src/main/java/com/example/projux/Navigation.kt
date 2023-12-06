package com.example.projux

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projux.screens.HomeScreen
import com.example.projux.screens.PurchaseReadScreen
import com.example.projux.screens.PurchaseScreen
import com.example.projux.screens.QrScreen
import com.example.projux.screens.ReportScreen
import com.example.projux.screens.Screen
import com.example.projux.views.PurchaseOK
import com.example.projux.views.QrView

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController =  navController, startDestination = Screen.HomeScreen.route) {

        composable(route = Screen.HomeScreen.route) { HomeScreen(navController = navController) }

        composable(route = Screen.PurchaseScreen.route) { PurchaseScreen(navController = navController) }
        composable(route = Screen.PurchaseReadScreen.route) { PurchaseReadScreen(navController = navController) }
        composable(route = Screen.PurchaseOKScreen.route) { PurchaseOK(navController = navController) }

        composable(route = Screen.QrScreen.route) { QrScreen(navController = navController) }
        composable(route = Screen.QrScreenImage.route) { QrView(navController = navController) }

        composable(route = Screen.CancelScreen.route) { HomeScreen(navController = navController) }
        composable(route = Screen.PreAuthorizationScreen.route) { HomeScreen(navController = navController) }

        composable(route = Screen.ReportScreen.route) { ReportScreen(navController = navController) }

        composable(route = Screen.CloseScreen.route) { HomeScreen(navController = navController) }
        composable(route = Screen.HelpScreen.route) { HomeScreen(navController = navController) }

    }
}