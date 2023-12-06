package com.example.projux.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    title: String,
    onClick: () -> Unit,
    backgroundColor: Color
) {
    var borderColor = Color.Gray
    var textColor = Color.White

    Box(
        Modifier
            .height(32.dp)
            .width(100.dp)
    ) {
        Box(
            modifier = Modifier
                .clickable { onClick.invoke() }
                .border(width = 2.dp, color = borderColor)
                .background(backgroundColor)
                .fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = title,
                fontWeight = FontWeight(600),
                color = textColor
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomButtonPrev() {
    CustomButton(title = "test", onClick = {}, backgroundColor = Color.Green)
}