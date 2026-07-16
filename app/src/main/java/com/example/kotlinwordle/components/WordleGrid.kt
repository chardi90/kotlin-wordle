package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WordleGrid(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Column {
            val padding = 16.dp

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))

            GridRow(viewModel = viewModel, modifier = Modifier)

            Spacer(Modifier.size(padding))
        }
    }
}