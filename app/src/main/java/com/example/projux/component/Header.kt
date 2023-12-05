package com.example.projux.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projux.R

@Composable
fun Header() {
    Image(painter = painterResource(id = R.drawable.header),
        contentDescription = "header",
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp))
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HeaderPrev() {
    Header()
}