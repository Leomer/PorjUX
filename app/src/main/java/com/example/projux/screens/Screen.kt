package com.example.projux.screens

sealed class Screen (val route: String) {
    object HomeScreen: Screen("home_screen")
    //Compra
    object PurchaseScreen: Screen("purchase_screen")
    object PurchaseReadScreen: Screen("purchase_read_screen")
    object PurchaseOKScreen: Screen("purchase_ok_screen")
    //Compra con Qr
    object QrScreen: Screen("qr_screen")
    object QrScreenImage: Screen("qr_image_screen")

    object CancelScreen: Screen("cancel_screen")
    object PreAuthorizationScreen: Screen("pre_authorization_screen")

    //reports
    object ReportScreen: Screen("report_screen")
    object CloseScreen: Screen("close_screen")
    object HelpScreen: Screen("help_screen")
}