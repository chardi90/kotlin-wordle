package com.example.kotlinwordle.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.kotlinwordle.R
import com.example.kotlinwordle.components.WordleViewModel

@Composable
fun ResultsPage(viewModel: WordleViewModel, onReturn: () -> Unit) {
    Column() {
        Text(text = "Wordle in 3!")
        Text(text = stringResource(R.string.congratulations))
        Text(text = stringResource(R.string.commiseration))
        Button(onClick = {
            viewModel.returnHome()
            onReturn()
        }) {
            Text(text = stringResource(R.string.home_button)) }
    }
}