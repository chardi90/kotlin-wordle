package com.example.kotlinwordle.components

import android.R.attr.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
        Square(viewModel = viewModel, modifier = Modifier.weight(1f))
        Square(viewModel = viewModel, modifier = Modifier.weight(1f))
        Square(viewModel = viewModel, modifier = Modifier.weight(1f))
        Square(viewModel = viewModel, modifier = Modifier.weight(1f))
        Square(viewModel = viewModel, modifier = Modifier.weight(1f))
    }
}