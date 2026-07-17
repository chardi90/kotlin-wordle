package com.example.kotlinwordle.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WordleViewModel: ViewModel() {
    var word by mutableStateOf(Words[0])
        private set
    var rowIndex by mutableIntStateOf(0)
        private set

    var finalScore by mutableIntStateOf(0)
        private set

    var hasWon by mutableStateOf(false)
        private set
    var letterInputOne by mutableStateOf("")
        private set
    var letterInputTwo by mutableStateOf("")
        private set
    var letterInputThree by mutableStateOf("")
        private set
    var letterInputFour by mutableStateOf("")
        private set
    var letterInputFive by mutableStateOf("")
        private set

    var playIsClicked by mutableStateOf(false)
        private set

    var submitIsClicked by mutableStateOf(false)
        private set

    var homeIsClicked by mutableStateOf(false)
        private set

    fun setWord() {
        val num = Words.indices.random()
        word = Words[num]
    }
    fun onInputChangeOne(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInputOne = value
    }
    fun onInputChangeTwo(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInputTwo = value
    }
    fun onInputChangeThree(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInputThree = value
    }
    fun onInputChangeFour(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInputFour = value
    }
    fun onInputChangeFive(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInputFive = value
    }

    fun playGame() {
        playIsClicked = !playIsClicked
    }

    fun submitRow() {
        if (rowIndex < 6) {
            rowIndex += 1
            submitIsClicked = !submitIsClicked
        } else {
            rowIndex += 1
            submitIsClicked = !submitIsClicked
            finalScore = rowIndex
            checkHasWon()
        }
    }

    fun checkHasWon() {
        if (finalScore <= 6) {
            hasWon = true
        }
    }

    fun returnHome() {
        homeIsClicked = !homeIsClicked
        rowIndex = 0
    }
}