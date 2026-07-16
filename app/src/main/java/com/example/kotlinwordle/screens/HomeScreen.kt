package com.example.kotlinwordle.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.kotlinwordle.R
import com.example.kotlinwordle.components.WordleViewModel

@Composable
fun HomePage(viewModel: WordleViewModel, onPlay: () -> Unit) {
    Column() {
        Text(text = stringResource(R.string.title))
        Text(text = stringResource(R.string.tag_line))
        Button(onClick = {
            viewModel.playGame()
            onPlay()
        }) {
            Text(text = stringResource(R.string.play_button)) }
    }
}