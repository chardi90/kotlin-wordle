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
            viewModel.letterInput_1 == wordToday[0].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInput_1) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundTwo = when {
            viewModel.letterInput_2 == wordToday[1].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInput_2) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundThree = when {
            viewModel.letterInput_3 == wordToday[2].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInput_3) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFour = when {
            viewModel.letterInput_4 == wordToday[3].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInput_4) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFive = when {
            viewModel.letterInput_5 == wordToday[4].toString() -> CorrectGreen
            wordToday.contains(viewModel.letterInput_5) -> PresentYellow
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
            value = viewModel.letterInput_1,
            onInputChange = { viewModel.onInputChange_1(it) },
            textColor = textColorOne,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundOne)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInput_2,
            onInputChange = { viewModel.onInputChange_2(it) },
            textColor = textColorTwo,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundTwo)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInput_3,
            onInputChange = { viewModel.onInputChange_3(it) },
            textColor = textColorThree,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundThree)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInput_4,
            onInputChange = { viewModel.onInputChange_4(it) },
            textColor = textColorFour,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFour)
                .border(1.dp, TileBorder)
        )
        Square(
            value = viewModel.letterInput_5,
            onInputChange = { viewModel.onInputChange_5(it) },
            textColor = textColorFive,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFive)
                .border(1.dp, TileBorder)
        )
    }
}