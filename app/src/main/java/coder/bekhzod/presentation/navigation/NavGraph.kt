package coder.bekhzod.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coder.bekhzod.presentation.screens.SplashScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreensRouter.SplashScreenRoute.route
    ){
        composable(ScreensRouter.SplashScreenRoute.route){
            SplashScreen(navController)
        }
    }
}