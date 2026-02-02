package com.novi_android.novi.ui.theme


import LightBackground
import LightSurface
import LightText
import NoviBlue
import NoviTeal
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun NoviTheme(content: @Composable () -> Unit) {
    val colorScheme = lightColorScheme(
        primary = NoviBlue,
        secondary = NoviTeal,
        background = LightBackground,
        surface = LightSurface,
        onBackground = LightText,
        onSurface = LightText
        // Add more colors if needed
    )

    MaterialTheme(
        colorScheme = colorScheme,
        // Assume you have a Typography file
        content = content
    )
}
