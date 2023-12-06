package com.example.projux.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projux.R
import com.example.projux.component.HeaderBack

@Composable
fun ReportScreen(navController: NavController?) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            HeaderBack(navController)
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.detail), contentDescription = "detail Report",
                modifier = Modifier.clickable { navController?.navigate(Screen.ReportScreen.route)})
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.total), contentDescription = "total Report",
                modifier = Modifier.clickable { navController?.navigate(Screen.ReportScreen.route)})
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.date), contentDescription = "date Report",
                modifier = Modifier.clickable { navController?.navigate(Screen.ReportScreen.route)})
        }

    }
}