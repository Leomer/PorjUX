package com.example.projux.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projux.component.CustomButton
import com.example.projux.component.Header

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun PurchaseScreen(navController: NavController?){

    val localContext =  LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Header()
        }

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Box {
                CustomButton(title = "Soles",
                    onClick = {},
                    backgroundColor = Color.Green)
            }
            Box {
                CustomButton(title = "Dolares",
                    onClick = {},
                    backgroundColor = Color.Gray)
            }

        }

        Spacer(modifier = Modifier.height(50.dp))

        Box(
            Modifier.fillMaxWidth()
        ) {
            var text by remember { mutableStateOf("") }

            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color.LightGray),
                placeholder = { Text("Ingrese el monto") },
                keyboardOptions = KeyboardOptions(
                    imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                    keyboardType = KeyboardType.Number
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        localContext?.hide()
                    }
                )
            )
        }

        Spacer(modifier = Modifier.height(400.dp))

        Box {
            CustomButton(
                title = "Continuar",
                onClick = {},
                backgroundColor = Color.Cyan)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PurchaseScreenPrev() {
    PurchaseScreen(null)
}

