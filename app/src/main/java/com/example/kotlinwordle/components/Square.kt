package com.example.kotlinwordle.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Square(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    val maxLength = 1
    var input = viewModel.letterInput
    Box(modifier
        .aspectRatio(1f)
        .padding(2.dp)
    ) {
        TextField(
            value = input,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                capitalization = KeyboardCapitalization.Characters),
            onValueChange = { newValue ->
                if (newValue.isEmpty() || newValue.matches(Regex("^[A-Z]+$")) || newValue.length == maxLength)
                    input = newValue
            },

            modifier = Modifier
                .background(color = Color.Gray)
        )
    }
}