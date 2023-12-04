package com.example.projux.windows

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController?) {
    Text(text = "Home")
}


@Preview(showBackground = true)
@Composable
fun HomePrev() {
    Home(null)
}