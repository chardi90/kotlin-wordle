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
    rowIndex: Int,
    modifier: Modifier = Modifier
) {
    val wordToday = stringResource(id = viewModel.word.word)
    val submittedGuess = viewModel.submittedGuesses.getOrNull(rowIndex)
    val isActiveRow = rowIndex == viewModel.rowIndex && submittedGuess == null

    val letter1 = submittedGuess?.get(0)?.toString() ?: if (isActiveRow) viewModel.letterInputOne else ""
    val letter2 = submittedGuess?.get(1)?.toString() ?: if (isActiveRow) viewModel.letterInputTwo else ""
    val letter3 = submittedGuess?.get(2)?.toString() ?: if (isActiveRow) viewModel.letterInputThree else ""
    val letter4 = submittedGuess?.get(3)?.toString() ?: if (isActiveRow) viewModel.letterInputFour else ""
    val letter5 = submittedGuess?.get(4)?.toString() ?: if (isActiveRow) viewModel.letterInputFive else ""

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
    if (submittedGuess != null) {
        backgroundOne = when {
            letter1 == wordToday[0].toString() -> CorrectGreen
            wordToday.contains(letter1) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundTwo = when {
            letter2 == wordToday[1].toString() -> CorrectGreen
            wordToday.contains(letter2) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundThree = when {
            letter3 == wordToday[2].toString() -> CorrectGreen
            wordToday.contains(letter3) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFour = when {
            letter4 == wordToday[3].toString() -> CorrectGreen
            wordToday.contains(letter4) -> PresentYellow
            else -> AbsentGrey
        }
        backgroundFive = when {
            letter5 == wordToday[4].toString() -> CorrectGreen
            wordToday.contains(letter5) -> PresentYellow
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
            value = letter1,
            onInputChange = { if (isActiveRow) viewModel.onInputChangeOne(it) },
            textColor = textColorOne,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundOne)
                .border(1.dp, TileBorder)
        )
        Square(
            value = letter2,
            onInputChange = { if (isActiveRow) viewModel.onInputChangeTwo(it) },
            textColor = textColorTwo,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundTwo)
                .border(1.dp, TileBorder)
        )
        Square(
            value = letter3,
            onInputChange = { if (isActiveRow) viewModel.onInputChangeThree(it) },
            textColor = textColorThree,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundThree)
                .border(1.dp, TileBorder)
        )
        Square(
            value = letter4,
            onInputChange = { if (isActiveRow) viewModel.onInputChangeFour(it) },
            textColor = textColorFour,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFour)
                .border(1.dp, TileBorder)
        )
        Square(
            value = letter5,
            onInputChange = { if (isActiveRow) viewModel.onInputChangeFive(it) },
            textColor = textColorFive,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
                .background(backgroundFive)
                .border(1.dp, TileBorder)
        )
    }
}