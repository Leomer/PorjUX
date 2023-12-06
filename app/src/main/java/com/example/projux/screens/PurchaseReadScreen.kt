package com.example.projux.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.projux.R
import com.example.projux.component.CustomButton
import com.example.projux.component.Header

@Composable
fun PurchaseReadScreen(navController: NavController?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
        ) {
            Header()
        }
        Box(
            modifier = Modifier
                .weight(14F)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.pos),
                modifier = Modifier.clickable { navController?.navigate(Screen.PurchaseOKScreen.route) },
                contentDescription = "pos")
        }

        Box(
            modifier = Modifier.weight(3F)
        ) {
            CustomButton(title = "Cancel", onClick = { navController?.navigate(Screen.HomeScreen.route) }, backgroundColor = Color.Gray)
        }
    }

}
