package com.example.woof.herodata
import com.example.woof.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

val heroes = listOf(
    Hero(nameRes = R.string.hero_1, descriptionRes = R.string.hero_description_1, imageRes = R.drawable.spiderman),
    Hero(nameRes = R.string.hero_2, descriptionRes = R.string.hero_description_2, imageRes = R.drawable.ironman),
    Hero(nameRes = R.string.hero_3, descriptionRes = R.string.hero_description_3, imageRes = R.drawable.deadpool),
    Hero(nameRes = R.string.hero_4, descriptionRes = R.string.hero_description_4, imageRes = R.drawable.batman),
    Hero(nameRes = R.string.hero_5, descriptionRes = R.string.hero_description_5, imageRes = R.drawable.blackpanther),
    Hero(nameRes = R.string.hero_6, descriptionRes = R.string.hero_description_6, imageRes = R.drawable.harleyquinn)
)