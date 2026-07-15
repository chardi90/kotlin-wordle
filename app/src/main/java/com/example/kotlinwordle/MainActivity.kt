package com.example.kotlinwordle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlinwordle.ui.theme.KotlinWordleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinWordleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun App( modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable(route = "home_screen") {
            HomePage(
                onPlay = { navController.navigate("puzzle_page") }
            )
        }
        composable(route = "puzzle_screen") {
            PuzzlePage(
                onFinish = { navController.navigate("results_page") }
            )
        }
        composable(route = "results_screen") {
            ResultsPage(
                onReturn = { navController.navigate("home_page") }
            )
        }
    }
}

@Composable
fun HomePage() {
    Column() {
        Text(text = stringResource(R.string.title))
        Text(text = stringResource(R.string.tag_line))
        Button(onClick = {}) { Text(text = stringResource(R.string.play_button)) }
    }
}

@Composable
fun PuzzlePage() {
    Column() {
        //Add in grid layout composable for word guesses
        Button(onClick = {}) { Text(text = stringResource(R.string.submit_button)) }
    }
}

@Composable
fun ResultsPage() {
    Column() {
        Text(text = "Wordle in 3!")
        Text(text = stringResource(R.string.congratulations))
        Text(text = stringResource(R.string.commiseration))
        Button(onClick = {}) { Text(text = stringResource(R.string.home_button)) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinWordleTheme {
        App()
    }
}