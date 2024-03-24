package coder.bekhzod.presentation.screens

import android.app.Application
import android.os.Handler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coder.bekhzod.R
import coder.bekhzod.presentation.navigation.ScreensRouter
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun SplashScreen(navController: NavController?) {
    val notesAnimComposition = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(resId = R.raw.notes)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            modifier = Modifier
                .size(250.dp),
            composition = notesAnimComposition.value,
            isPlaying = true,
            restartOnPlay = true,
            reverseOnRepeat = true,
        )
    }
    Handler().postDelayed({
        navController?.navigate(ScreensRouter.MainScreenRoute.route)
    },2000)
}

@Preview
@Composable
fun PreviewSplashScreen() {
    SplashScreen(null)
}