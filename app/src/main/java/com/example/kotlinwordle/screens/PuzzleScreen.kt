package com.example.kotlinwordle.screens

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
import com.example.kotlinwordle.R
import com.example.kotlinwordle.components.WordleGrid
import com.example.kotlinwordle.components.WordleViewModel

@Composable
fun PuzzlePage(
    viewModel: WordleViewModel,
    onFinish: () -> Unit,
    modifier: Modifier = Modifier
) {
    viewModel.setWord()
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        WordleGrid(viewModel = viewModel, modifier = modifier)

        Spacer(Modifier.size(30.dp))

        Button(onClick = {
            viewModel.submitRow()
            onFinish()
        }) {
            Text(text = stringResource(R.string.submit_button))
        }
    }
}