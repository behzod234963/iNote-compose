package coder.bekhzod.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import coder.bekhzod.presentation.screens.EmptyMainScreen
import coder.bekhzod.presentation.screens.MainScreen
import coder.bekhzod.presentation.screens.SplashScreen
import coder.bekhzod.presentation.ui.theme.INoteTheme
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import coder.bekhzod.presentation.utils.events.PassDataEvents

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(NavController(this), NOTES_MODEL_OBJECT)
        }
    }
}