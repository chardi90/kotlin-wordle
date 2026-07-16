package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GridRow(
    modifier: Modifier = Modifier
) {
    Row() {
        Text(text = "5 squares")
    }
}