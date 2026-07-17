package com.example.kotlinwordle.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = MintGlow,
    secondary = SageGreen,
    tertiary = MossGreen,
    background = DeepForest,
    surface = PineGreen,
    onPrimary = DeepForest,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color(0xFFDCE8DC),
    outline = MossGreen
)

private val LightColorScheme = lightColorScheme(
    primary = PineGreen,
    secondary = SageGreen,
    tertiary = MossGreen,
    background = Color.White,
    surface = Color(0xFFF2F6F2),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = DeepForest,
    onSurface = DeepForest,
    outline = SageGreen
)

@Composable
fun KotlinWordleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}