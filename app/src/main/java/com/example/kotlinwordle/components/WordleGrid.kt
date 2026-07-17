package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WordleGrid(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            repeat( 6 ) { index ->
                GridRow(viewModel = viewModel, rowIndex = index, modifier = Modifier)
            }
        }
    }
}