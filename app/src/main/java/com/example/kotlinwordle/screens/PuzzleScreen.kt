package com.example.kotlinwordle.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.kotlinwordle.R
import com.example.kotlinwordle.components.WordleViewModel

@Composable
fun PuzzlePage(viewModel: WordleViewModel, onFinish: () -> Unit) {
    Column() {
        //Add in grid layout composable for word guesses
        Button(onClick = {
            viewModel.submitRow()
            onFinish()
        }) {
            Text(text = stringResource(R.string.submit_button)) }
    }
}