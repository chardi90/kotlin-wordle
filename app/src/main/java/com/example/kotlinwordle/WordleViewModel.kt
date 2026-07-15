package com.example.kotlinwordle

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WordleViewModel: viewModel() {
    var rowIndex by mutableIntStateOf(0)
        private set
}
