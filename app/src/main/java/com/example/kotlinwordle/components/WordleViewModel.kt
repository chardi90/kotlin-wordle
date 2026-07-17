package com.example.kotlinwordle.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kotlinwordle.components.Word

class WordleViewModel: ViewModel() {
    var word by mutableStateOf(Words[0])
        private set
    var rowIndex by mutableIntStateOf(0)
        private set

    var letterInput_1 by mutableStateOf("")
        private set
    var letterInput_2 by mutableStateOf("")
        private set
    var letterInput_3 by mutableStateOf("")
        private set
    var letterInput_4 by mutableStateOf("")
        private set
    var letterInput_5 by mutableStateOf("")
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
    fun onInputChange_1(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInput_1 = value
    }
    fun onInputChange_2(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInput_2 = value
    }
    fun onInputChange_3(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInput_3 = value
    }
    fun onInputChange_4(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInput_4 = value
    }
    fun onInputChange_5(value: String) {
        val maxLength = 1
        if (value.isEmpty() || value.matches(Regex("^[A-Z]+$")) || value.length == maxLength)
                letterInput_5 = value
    }

    fun playGame() {
        playIsClicked = !playIsClicked
    }

    fun submitRow() {
        if (rowIndex < 6) {
            rowIndex += 1
            submitIsClicked = !submitIsClicked
        } else {
            //finishedIsClicked
        }
    }

    fun returnHome() {
        homeIsClicked = !homeIsClicked
        rowIndex = 0
    }
}