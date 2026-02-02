// MainActivity.kt
package com.novi_android.novi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.novi_android.novi.auth.LoginScreen
import com.novi_android.novi.auth.SignUpScreen
// Add this import statement:
import com.novi_android.novi.ui.theme.NoviTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // This line should now resolve correctly
            NoviTheme {
                // This function controls which screen is visible
                AppNavigation()
            }
        }
    }
}
// ... (AppNavigation composable code goes below this) ...

@Composable
fun AppNavigation() {
    // This state remembers which screen is currently active
    var currentScreen by remember { mutableStateOf("login") }

    when (currentScreen) {
        "login" -> LoginScreen(
            onLoginSuccess = {
                /* Logic for moving to Home Screen goes here later */
            },
            onSwitchToSignup = {
                // When "Create an account" is clicked, we change the state
                currentScreen = "signup"
            }
        )
        "signup" -> SignUpScreen(
            onSignUpSuccess = {
                // After signing up, go back to login
                currentScreen = "login"
            },
            onSwitchToLogin = {
                // If they click "Already have an account? Login"
                currentScreen = "login"
            }
        )
    }
}

