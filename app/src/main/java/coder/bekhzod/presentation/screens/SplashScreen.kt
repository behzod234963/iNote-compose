package coder.bekhzod.presentation.screens

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
import coder.bekhzod.R
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun SplashScreen() {
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
}

@Preview
@Composable
fun PreviewSplashScreen() {
    SplashScreen()
}