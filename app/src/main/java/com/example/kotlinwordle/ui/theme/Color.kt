package com.example.kotlinwordle.ui.theme

import androidx.compose.ui.graphics.Color

// Palette — surrounding UI (backgrounds, surfaces, buttons, text accents)
val DeepForest = Color(0xFF1A1F16)
val PineGreen = Color(0xFF1E3F20)
val MossGreen = Color(0xFF345830)
val SageGreen = Color(0xFF4A7856)
val MintGlow = Color(0xFF94ECBE)

// Light mode neutrals
val StoneWhite = Color(0xFFF5F3EE)
val StoneSurface = Color(0xFFEAE7DE)

// Feedback colors — Wordle tile states only
val CorrectGreen = Color(0xFF538D4E)
val PresentYellow = Color(0xFFB59F3B)
val AbsentGrey = Color(0xFF3A3A3C)
val TileBorder = Color(0xFFB0A99C)

// Empty/unfilled tile background (letters not yet submitted)
val TileEmptyBackground = StoneWhite
val TileEmptyText = DeepForest
val TileFilledText = Color.White

