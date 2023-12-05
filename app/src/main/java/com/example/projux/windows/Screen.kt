package com.example.projux.windows

sealed class Screen (val route: String) {
    object HomeScreen: Screen("home_screen")
    object PurchaseScreen: Screen("purchase_screen")
    object QrScreen: Screen("qr_screen")
}