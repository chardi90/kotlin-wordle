package com.example.kotlinwordle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlinwordle.components.WordleViewModel
import com.example.kotlinwordle.screens.HomePage
import com.example.kotlinwordle.screens.PuzzlePage
import com.example.kotlinwordle.screens.ResultsPage
import com.example.kotlinwordle.ui.theme.KotlinWordleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinWordleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(viewModel: WordleViewModel = viewModel()) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable(route = "home_screen") {
            HomePage(
                viewModel = viewModel,
                onPlay = { navController.navigate("puzzle_screen") }
            )
        }
        composable(route = "puzzle_screen") {
            PuzzlePage(
                viewModel = viewModel,
                onFinish = { navController.navigate("results_screen") }
            )
        }
        composable(route = "results_screen") {
            ResultsPage(
                viewModel = viewModel,
                onReturn = { navController.navigate("home_screen") }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinWordleTheme {
        App()
    }
}