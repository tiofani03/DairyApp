package com.tioooo.diaryapp.model

import androidx.compose.ui.graphics.Color
import com.tioooo.diaryapp.R
import com.tioooo.diaryapp.ui.theme.AngryColor
import com.tioooo.diaryapp.ui.theme.AwfulColor
import com.tioooo.diaryapp.ui.theme.BoredColor
import com.tioooo.diaryapp.ui.theme.CalmColor
import com.tioooo.diaryapp.ui.theme.DepressedColor
import com.tioooo.diaryapp.ui.theme.DisappointedColor
import com.tioooo.diaryapp.ui.theme.HappyColor
import com.tioooo.diaryapp.ui.theme.HumorousColor
import com.tioooo.diaryapp.ui.theme.LonelyColor
import com.tioooo.diaryapp.ui.theme.MysteriousColor
import com.tioooo.diaryapp.ui.theme.NeutralColor
import com.tioooo.diaryapp.ui.theme.RomanticColor
import com.tioooo.diaryapp.ui.theme.ShamefulColor
import com.tioooo.diaryapp.ui.theme.SurprisedColor
import com.tioooo.diaryapp.ui.theme.SuspiciousColor
import com.tioooo.diaryapp.ui.theme.TenseColor


enum class Mood(
    val icon: Int,
    val contentColor: Color,
    val containerColor: Color,
) {
    Neutral(
        icon = R.drawable.ic_neutral,
        contentColor = Color.Black,
        containerColor = NeutralColor
    ),
    Happy(
        icon = R.drawable.ic_happy,
        contentColor = Color.Black,
        containerColor = HappyColor
    ),
    Angry(
        icon = R.drawable.ic_angry,
        contentColor = Color.White,
        containerColor = AngryColor
    ),
    Bored(
        icon = R.drawable.ic_bored,
        contentColor = Color.Black,
        containerColor = BoredColor
    ),
    Calm(
        icon = R.drawable.ic_calm,
        contentColor = Color.Black,
        containerColor = CalmColor
    ),
    Depressed(
        icon = R.drawable.ic_depressed,
        contentColor = Color.Black,
        containerColor = DepressedColor
    ),
    Disappointed(
        icon = R.drawable.ic_disappointed,
        contentColor = Color.White,
        containerColor = DisappointedColor
    ),
    Humorous(
        icon = R.drawable.ic_humorous,
        contentColor = Color.Black,
        containerColor = HumorousColor
    ),
    Lonely(
        icon = R.drawable.ic_lonely,
        contentColor = Color.White,
        containerColor = LonelyColor
    ),
    Mysterious(
        icon = R.drawable.ic_mysterious,
        contentColor = Color.Black,
        containerColor = MysteriousColor
    ),
    Romantic(
        icon = R.drawable.ic_romantic,
        contentColor = Color.White,
        containerColor = RomanticColor
    ),
    Shameful(
        icon = R.drawable.ic_shameful,
        contentColor = Color.White,
        containerColor = ShamefulColor
    ),
    Awful(
        icon = R.drawable.ic_awful,
        contentColor = Color.Black,
        containerColor = AwfulColor
    ),
    Surprised(
        icon = R.drawable.ic_surprised,
        contentColor = Color.Black,
        containerColor = SurprisedColor
    ),
    Suspicious(
        icon = R.drawable.ic_suspicious,
        contentColor = Color.Black,
        containerColor = SuspiciousColor
    ),
    Tense(
        icon = R.drawable.ic_tense,
        contentColor = Color.Black,
        containerColor = TenseColor
    )
}
