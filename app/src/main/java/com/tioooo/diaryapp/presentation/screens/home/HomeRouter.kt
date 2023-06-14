package com.tioooo.diaryapp.presentation.screens.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tioooo.diaryapp.navigation.Screen

fun NavGraphBuilder.homeRouter(
    navigateToWrite: () -> Unit,
) {
    composable(route = Screen.Home.route) {
        HomeScreen(
            onMenuClicked = {

            },
            navigateToWrite = { navigateToWrite() }
        )
    }
}
