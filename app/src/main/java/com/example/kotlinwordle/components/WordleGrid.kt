package com.example.kotlinwordle.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.kotlinwordle.R

@Composable
fun WordleGrid(
    modifier: Modifier = Modifier
) {
    Box() {

    }
    Button(
        onClick = {},
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.submit_button),
            modifier = modifier
        )
    }
}