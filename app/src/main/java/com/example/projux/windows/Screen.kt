package com.example.projux.windows

sealed class Screen (val route: String) {
    object HomeScreen: Screen("home_screen")
    object PurchaseScreen: Screen("purchase_screen")
    object QrScreen: Screen("qr_screen")
    object CancelScreen: Screen("cancel_screen")
    object PreAuthorizationScreen: Screen("pre_authorization_screen")
    object ReportScreen: Screen("report_screen")
    object CloseScreen: Screen("close_screen")
    object HelpScreen: Screen("help_screen")
}