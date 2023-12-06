package com.example.projux.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projux.R
import com.example.projux.screens.Screen

@Composable
fun HeaderBack(navController: NavController?) {
    Row (
        modifier = Modifier.fillMaxWidth()
    ) {
        Box (
            Modifier
                .weight(1F)
                .padding(top = 3.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.back),
                contentDescription = "back",
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .height(22.dp)
                    .clickable { navController?.navigate(Screen.HomeScreen.route) },
                )
        }

        Box (
            Modifier.weight(10F)
        ) {
            Image(painter = painterResource(id = R.drawable.header),
                contentDescription = "header",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp))
        }
    }
}