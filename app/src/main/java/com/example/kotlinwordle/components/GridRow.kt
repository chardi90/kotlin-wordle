package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun GridRow(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxWidth()
    ) {
        Square(
            value = viewModel.letterInput,
            onInputChange = { viewModel.onInputChange(it) },
            modifier = Modifier.weight(1f)
        )
        Square(
            value = viewModel.letterInput,
            onInputChange = { viewModel.onInputChange(it) },
            modifier = Modifier.weight(1f)
        )
        Square(
            value = viewModel.letterInput,
            onInputChange = { viewModel.onInputChange(it) },
            modifier = Modifier.weight(1f)
        )
        Square(
            value = viewModel.letterInput,
            onInputChange = { viewModel.onInputChange(it) },
            modifier = Modifier.weight(1f)
        )
        Square(
            value = viewModel.letterInput,
            onInputChange = { viewModel.onInputChange(it) },
            modifier = Modifier.weight(1f)
        )
    }
}