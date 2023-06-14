package com.tioooo.diaryapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tioooo.diaryapp.presentation.screens.auth.authenticationRouter
import com.tioooo.diaryapp.presentation.screens.home.homeRouter
import com.tioooo.diaryapp.presentation.screens.write.writeRouter

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController,
) {
    NavHost(
        startDestination = startDestination,
        navController = navController,
    ) {
        authenticationRouter(
            navigateToHome = {
                navController.popBackStack()
                navController.navigate(Screen.Home.route)
            }
        )
        homeRouter(
            navigateToWrite = {
                navController.navigate(Screen.Write.route)
            }
        )
        writeRouter()
    }
}
