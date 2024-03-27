package coder.bekhzod.presentation.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coder.bekhzod.R
import coder.bekhzod.presentation.navigation.ScreensRouter
import coder.bekhzod.presentation.utils.constants.THEME_COLOR
import coder.bekhzod.presentation.utils.events.PassDataEvents
import coder.bekhzod.presentation.views.MainTopAppBar
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun EmptyMainScreen(navController: NavController) {
    val lottieComposition = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(resId = R.raw.empty_list)
    )
    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(THEME_COLOR),
        ) {
            MainTopAppBar(navController)
        }
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ){
            LottieAnimation(
                composition = lottieComposition.value,
                isPlaying = true,
                alignment = Alignment.Center,
                )
            FloatingActionButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 30.dp, end = 30.dp),
                shape = CircleShape,
                containerColor = Color.Magenta,
                onClick = {
                    navController.navigate(ScreensRouter.NewNoteScreenRoute.route)
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = "button add",
                    tint = Color.White
                )
            }
        }
    }
}