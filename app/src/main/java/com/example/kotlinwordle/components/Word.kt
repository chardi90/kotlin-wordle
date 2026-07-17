package com.example.kotlinwordle.components

import androidx.annotation.StringRes
import com.example.kotlinwordle.R

data class Word(
    @StringRes val word: Int,
)

val Words = listOf(
    Word(R.string.word_1),
    Word(R.string.word_2),
    Word(R.string.word_3),
    Word(R.string.word_4)
)