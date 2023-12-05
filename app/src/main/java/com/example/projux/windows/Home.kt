package com.example.projux.windows

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projux.R
import com.example.projux.component.Header

@Composable
fun Home(navController: NavController?) {
    val context = LocalContext.current
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Header()
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        ) {
            Box (
            ) {
                Image(painter = painterResource(id = R.drawable.purchase), contentDescription = "purchase",
                    modifier = Modifier.clickable { navController?.navigate(Screen.PurchaseScreen.route)})
            }

            Spacer(modifier = Modifier.width(35.dp))

            Box (
            ) {
                Image(painter = painterResource(id = R.drawable.qr), contentDescription = "qr",
                    modifier = Modifier.clickable { navController?.navigate(Screen.QrScreen.route)})
            }


        }


    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePrev() {
    Home(null)
}