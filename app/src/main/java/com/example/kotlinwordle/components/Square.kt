package com.example.kotlinwordle.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Square(
    value: String,
    onInputChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier
        .aspectRatio(1f)
        .padding(2.dp)
    ) {
        TextField(
            value = value,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                capitalization = KeyboardCapitalization.Characters),
            onValueChange = onInputChange,
            modifier = Modifier
                .background(color = Color.Gray)
        )
    }
}