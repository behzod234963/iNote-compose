package coder.bekhzod.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coder.behzod.domain.model.NotesModel
import coder.bekhzod.R
import coder.bekhzod.presentation.navigation.ScreensRouter
import coder.bekhzod.presentation.utils.constants.NOTES_MODEL_OBJECT
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val notesAnimComposition = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(resId = R.raw.notes)
    )
    val list = ArrayList<NotesModel>()
    list.add(NOTES_MODEL_OBJECT)
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
    LaunchedEffect(key1 = true) {
        delay(2500)
        if (list.isEmpty()){
            navController.navigate(ScreensRouter.EmptyMainScreenRoute.route)
        }else{
            navController.navigate(ScreensRouter.MainScreenRoute.route)
        }
    }
}
