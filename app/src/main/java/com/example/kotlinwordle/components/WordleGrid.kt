package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kotlinwordle.R

@Composable
fun WordleGrid(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box() {
            Column() {
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

        Spacer(Modifier.size(30.dp))

        Button(
            onClick = {},
            modifier = modifier
        ) {
            Text(
                text = stringResource(R.string.submit_button),
                modifier = modifier
            )
        }
    }
}