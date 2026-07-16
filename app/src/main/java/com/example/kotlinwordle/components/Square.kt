package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun Square(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    val maxLength = 1
    var input = viewModel.letterInput
    Box() {
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
            modifier = modifier
        )
    }
}