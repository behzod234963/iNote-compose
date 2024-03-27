package coder.bekhzod.presentation.views

import androidx.compose.foundation.border
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coder.bekhzod.presentation.navigation.ScreensRouter
import coder.bekhzod.presentation.ui.theme.fontAmidoneGrotesk
import coder.bekhzod.presentation.utils.constants.FONT_AND_BORDER_COLOR
import coder.bekhzod.presentation.utils.constants.THEME_COLOR

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsTopAppBar(navController: NavController) {
    TopAppBar(
        modifier = Modifier
            .border(width = 1.dp, color = FONT_AND_BORDER_COLOR),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = THEME_COLOR
        ),
        title = {
            Text(
                text = "Settings",
                fontSize = 25.sp,
                fontFamily = FontFamily(fontAmidoneGrotesk),
                color = FONT_AND_BORDER_COLOR
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                navController.navigate(ScreensRouter.MainScreenRoute.route)
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back to main",
                    tint = FONT_AND_BORDER_COLOR
                )
            }
        }
    )
}

@Preview
@Composable
private fun PreviewSTAB() {
    SettingsTopAppBar(NavController(LocalContext.current))
}