package coder.bekhzod.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coder.bekhzod.presentation.screens.EmptyMainScreen
import coder.bekhzod.presentation.screens.MainScreen
import coder.bekhzod.presentation.screens.NewNoteScreen
import coder.bekhzod.presentation.screens.SettingsScreen
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
        composable(ScreensRouter.SettingsScreenRoute.route){
            SettingsScreen(navController)
        }
        composable(ScreensRouter.MainScreenRoute.route){
            MainScreen(navController = navController, null)
        }
        composable(ScreensRouter.EmptyMainScreenRoute.route){
            EmptyMainScreen(navController = navController)
        }
        composable(ScreensRouter.NewNoteScreenRoute.route){
            NewNoteScreen(navController,null)
        }
    }
}