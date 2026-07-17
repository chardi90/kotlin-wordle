package com.example.kotlinwordle.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@Composable
fun GridRow(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    val wordToday = stringResource(id = viewModel.word.word)
    var background_1 = Color.DarkGray
    var background_2 = Color.DarkGray
    var background_3 = Color.DarkGray
    var background_4 = Color.DarkGray
    var background_5 = Color.DarkGray

    if (viewModel.submitIsClicked) {
        if (viewModel.letterInput_1 == wordToday[0].toString()) {
            background_1 = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_1)) {
            background_1 = Color.Yellow
        } else {
            background_1 = Color.DarkGray
        }

        if (viewModel.letterInput_2 == wordToday[1].toString()) {
            background_2 = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_2)) {
            background_2 = Color.Yellow
        } else {
            background_2 = Color.DarkGray
        }

        if (viewModel.letterInput_3 == wordToday[2].toString()) {
            background_3 = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_3)) {
            background_3 = Color.Yellow
        } else {
            background_3 = Color.DarkGray
        }

        if (viewModel.letterInput_4 == wordToday[3].toString()) {
            background_4 = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_4)) {
            background_4 = Color.Yellow
        } else {
            background_4 = Color.DarkGray
        }

        if (viewModel.letterInput_5 == wordToday[4].toString()) {
            background_5 = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_5)) {
            background_5 = Color.Yellow
        } else {
            background_5 = Color.DarkGray
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxWidth()
    ) {
        Square(
            value = viewModel.letterInput_1,
            onInputChange = { viewModel.onInputChange_1(it) },
            modifier = Modifier.weight(1f).background(background_1)
        )
        Square(
            value = viewModel.letterInput_2,
            onInputChange = { viewModel.onInputChange_2(it) },
            modifier = Modifier.weight(1f).background(background_2)
        )
        Square(
            value = viewModel.letterInput_3,
            onInputChange = { viewModel.onInputChange_3(it) },
            modifier = Modifier.weight(1f).background(background_3)
        )
        Square(
            value = viewModel.letterInput_4,
            onInputChange = { viewModel.onInputChange_4(it) },
            modifier = Modifier.weight(1f).background(background_4)
        )
        Square(
            value = viewModel.letterInput_5,
            onInputChange = { viewModel.onInputChange_5(it) },
            modifier = Modifier.weight(1f).background(background_5)
        )
    }
}