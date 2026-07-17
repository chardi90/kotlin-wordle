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
    var backgroundOne = Color.DarkGray
    var backgroundTwo = Color.DarkGray
    var backgroundThree = Color.DarkGray
    var backgroundFour = Color.DarkGray
    var backgroundFive = Color.DarkGray

    if (viewModel.submitIsClicked) {
        if (viewModel.letterInput_1 == wordToday[0].toString()) {
            backgroundOne = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_1)) {
            backgroundOne = Color.Yellow
        } else {
            backgroundOne = Color.DarkGray
        }

        if (viewModel.letterInput_2 == wordToday[1].toString()) {
            backgroundTwo = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_2)) {
            backgroundTwo = Color.Yellow
        } else {
            backgroundTwo = Color.DarkGray
        }

        if (viewModel.letterInput_3 == wordToday[2].toString()) {
            backgroundThree = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_3)) {
            backgroundThree = Color.Yellow
        } else {
            backgroundThree = Color.DarkGray
        }

        if (viewModel.letterInput_4 == wordToday[3].toString()) {
            backgroundFour = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_4)) {
            backgroundFour = Color.Yellow
        } else {
            backgroundFour = Color.DarkGray
        }

        if (viewModel.letterInput_5 == wordToday[4].toString()) {
            backgroundFive = Color.Green
        } else if (wordToday.contains(viewModel.letterInput_5)) {
            backgroundFive = Color.Yellow
        } else {
            backgroundFive = Color.DarkGray
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
            modifier = Modifier.weight(1f).background(backgroundOne)
        )
        Square(
            value = viewModel.letterInput_2,
            onInputChange = { viewModel.onInputChange_2(it) },
            modifier = Modifier.weight(1f).background(backgroundTwo)
        )
        Square(
            value = viewModel.letterInput_3,
            onInputChange = { viewModel.onInputChange_3(it) },
            modifier = Modifier.weight(1f).background(backgroundThree)
        )
        Square(
            value = viewModel.letterInput_4,
            onInputChange = { viewModel.onInputChange_4(it) },
            modifier = Modifier.weight(1f).background(backgroundFour)
        )
        Square(
            value = viewModel.letterInput_5,
            onInputChange = { viewModel.onInputChange_5(it) },
            modifier = Modifier.weight(1f).background(backgroundFive)
        )
    }
}