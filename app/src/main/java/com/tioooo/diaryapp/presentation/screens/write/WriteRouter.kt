package com.tioooo.diaryapp.presentation.screens.write

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tioooo.diaryapp.navigation.Screen
import com.tioooo.diaryapp.utils.Constants

fun NavGraphBuilder.writeRouter() {
    composable(
        route = Screen.Write.route,
        arguments = listOf(navArgument(name = Constants.WRITE_SCREEN_ARGUMENT_KEY) {
            type = NavType.StringType
            nullable = true
            defaultValue = null
        }),
    ) {

    }
}
