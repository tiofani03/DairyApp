package com.tioooo.diaryapp.navigation

import com.tioooo.diaryapp.utils.Constants.WRITE_SCREEN_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Authentication : Screen(route = "authentication_screen")
    object Home : Screen(route = "home_screen")
    object Write :
        Screen(route = "write_screen?$WRITE_SCREEN_ARGUMENT_KEY={$WRITE_SCREEN_ARGUMENT_KEY}") {
        fun passDiaryId(diaryId: String): String {
            return route.replace("{$WRITE_SCREEN_ARGUMENT_KEY}", diaryId)
        }
    }
}
