package com.example.kotlinwordle.components

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class WordleViewModel: ViewModel() {
    var rowIndex by mutableIntStateOf(0)
        private set

    var playIsClicked by mutableStateOf(false)
        private set

    var submitIsClicked by mutableStateOf(false)
        private set

    var homeIsClicked by mutableStateOf(false)
        private set

    fun playGame() {
        playIsClicked = !playIsClicked
    }

    fun submitRow() {
        submitIsClicked = !submitIsClicked
    }

    fun returnHome() {
        homeIsClicked = !homeIsClicked
        rowIndex = 0
    }
}