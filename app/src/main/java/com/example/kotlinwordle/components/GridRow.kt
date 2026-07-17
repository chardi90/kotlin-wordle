package com.example.kotlinwordle.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.kotlinwordle.ui.theme.AbsentGrey
import com.example.kotlinwordle.ui.theme.CorrectGreen
import com.example.kotlinwordle.ui.theme.PresentYellow
import com.example.kotlinwordle.ui.theme.TileBorder
import com.example.kotlinwordle.ui.theme.TileEmptyBackground
import com.example.kotlinwordle.ui.theme.TileEmptyText
import com.example.kotlinwordle.ui.theme.TileFilledText

@Composable
fun GridRow(
    viewModel: WordleViewModel,
    modifier: Modifier = Modifier
) {
    val wordToday = stringResource(id = viewModel.word.word)

    var backgroundOne: Color = TileEmptyBackground
    var backgroundTwo: Color = TileEmptyBackground
    var backgroundThree: Color = TileEmptyBackground
    var backgroundFour: Color = TileEmptyBackground
    var backgroundFive: Color = TileEmptyBackground

    var textColorOne = TileEmptyText
    var textColorTwo = TileEmptyText
    var textColorThree = TileEmptyText
    var textColorFour = TileEmptyText
    var textColorFive = TileEmptyText

    if (viewModel.submitIsClicked) {
        backgroundOne = when {
            viewModel.letterInputOne == wordToday[0].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInputOne) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundTwo = when {
            viewModel.letterInputTwo == wordToday[1].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInputTwo) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundThree = when {
            viewModel.letterInputThree == wordToday[2].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInputThree) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFour = when {
            viewModel.letterInputFour == wordToday[3].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInputFour) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFive = when {
            viewModel.letterInputFive == wordToday[4].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInputFive) -> PresentYellow
            else -> AbsentGrey
        }

        textColorOne = TileFilledText
        textColorTwo = TileFilledText
        textColorThree = TileFilledText
        textColorFour = TileFilledText
        textColorFive = TileFilledText
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxWidth()
    ) {
        Square(
            value = viewModel.letterInputOne,
            onInputChange = { viewModel.onInputChangeOne(it) },
            textColor = textColorOne,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundOne)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInputTwo,
            onInputChange = { viewModel.onInputChangeTwo(it) },
            textColor = textColorTwo,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundTwo)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInputThree,
            onInputChange = { viewModel.onInputChangeThree(it) },
            textColor = textColorThree,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundThree)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInputFour,
            onInputChange = { viewModel.onInputChangeFour(it) },
            textColor = textColorFour,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFour)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInputFive,
            onInputChange = { viewModel.onInputChangeFive(it) },
            textColor = textColorFive,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFive)
                .border(1.dp, TileBorder)
        )
    }
}