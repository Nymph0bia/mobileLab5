package com.example.woof.musicdata

import com.example.woof.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Album(
    @StringRes val day: Int,
    @StringRes val nameRes: Int,
    @DrawableRes val imageAlbum: Int,
    @StringRes val descriptionAlbum: Int
)

val albums = listOf(
    Album(day = R.string.day_1, nameRes = R.string.seeking_darkness, imageAlbum = R.drawable.seeking_darkness_cover, descriptionAlbum = R.string.seeking_darkness_desc),
    Album(day = R.string.day_2, nameRes = R.string.willoughby_tucker, imageAlbum = R.drawable.willoughby_tucker_cover, descriptionAlbum = R.string.willoughby_tucker_desc),
    Album(day = R.string.day_3, nameRes = R.string.luminescent_creatures, imageAlbum = R.drawable.luminescent_creatures_cover, descriptionAlbum = R.string.luminescent_creatures_desc),
    Album(day = R.string.day_4, nameRes = R.string.balloonerism, imageAlbum = R.drawable.balloonerism_cover, descriptionAlbum = R.string.balloonerism_desc),
    Album(day = R.string.day_5, nameRes = R.string.private_music, imageAlbum = R.drawable.private_music_cover, descriptionAlbum = R.string.private_music_desc),
    Album(day = R.string.day_6, nameRes = R.string.pirouette, imageAlbum = R.drawable.pirouette_cover, descriptionAlbum = R.string.pirouette_desc),
    Album(day = R.string.day_7, nameRes = R.string.soft_spot, imageAlbum = R.drawable.soft_spot_cover, descriptionAlbum = R.string.soft_spot_desc),
    Album(day = R.string.day_8, nameRes = R.string.eusexua, imageAlbum = R.drawable.eusexua_cover, descriptionAlbum = R.string.eusexua_desc),
    Album(day = R.string.day_9, nameRes = R.string.apiary, imageAlbum = R.drawable.apiary_cover, descriptionAlbum = R.string.apiary_desc),
    Album(day = R.string.day_10, nameRes = R.string.forward, imageAlbum = R.drawable.forward_cover, descriptionAlbum = R.string.forward_desc),
    Album(day = R.string.day_11, nameRes = R.string.and_still_it_flutters, imageAlbum = R.drawable.and_still_it_flutters_cover, descriptionAlbum = R.string.and_still_it_flutters_desc),
    Album(day = R.string.day_12, nameRes = R.string.i_am_a_spiritual, imageAlbum = R.drawable.i_am_a_spiritual_cover, descriptionAlbum = R.string.i_am_a_spiritual_desc),
    Album(day = R.string.day_13, nameRes = R.string.have_you_heard_of_the_high_elves, imageAlbum = R.drawable.have_you_heard_of_the_high_elves_cover, descriptionAlbum = R.string.have_you_heard_of_the_high_elves_desc),
    Album(day = R.string.day_14, nameRes = R.string.dronevil_example, imageAlbum = R.drawable.dronevil_example_cover, descriptionAlbum = R.string.dronevil_example_desc),
    Album(day = R.string.day_15, nameRes = R.string.choke_enough, imageAlbum = R.drawable.choke_enough_cover, descriptionAlbum = R.string.choke_enough_desc),
    Album(day = R.string.day_16, nameRes = R.string.i_felt_like_a_sketch, imageAlbum = R.drawable.i_felt_like_a_sketch_cover, descriptionAlbum = R.string.i_felt_like_a_sketch_desc),
    Album(day = R.string.day_17, nameRes = R.string.dawn_arrives, imageAlbum = R.drawable.dawn_arrives_cover, descriptionAlbum = R.string.dawn_arrives_desc),
    Album(day = R.string.day_18, nameRes = R.string.fancy_that, imageAlbum = R.drawable.fancy_that_cover, descriptionAlbum = R.string.fancy_that_desc),
    Album(day = R.string.day_19, nameRes = R.string.for_everything, imageAlbum = R.drawable.for_everything_cover, descriptionAlbum = R.string.for_everything_desc),
    Album(day = R.string.day_20, nameRes = R.string.heartstring, imageAlbum = R.drawable.heartstrings_cover, descriptionAlbum = R.string.heartstring_desc),
    Album(day = R.string.day_21, nameRes = R.string.unkillable_angel, imageAlbum = R.drawable.unkillable_angel_cover, descriptionAlbum = R.string.unkillable_angel_desc),
    Album(day = R.string.day_22, nameRes = R.string.addison, imageAlbum = R.drawable.addison_cover, descriptionAlbum = R.string.addison_desc),
    Album(day = R.string.day_23, nameRes = R.string.abomination_revealed_at_last, imageAlbum = R.drawable.abomination_revealed_at_last_cover, descriptionAlbum = R.string.abomination_revealed_at_last_desc),
    Album(day = R.string.day_24, nameRes = R.string.darling_love_story, imageAlbum = R.drawable.draining_love_story_cover, descriptionAlbum = R.string.darling_love_story_desc),
    Album(day = R.string.day_25, nameRes = R.string.tulip, imageAlbum = R.drawable.tulip_cover, descriptionAlbum = R.string.tulip_desc),
    Album(day = R.string.day_26, nameRes = R.string.pressure, imageAlbum = R.drawable.pressure_cover, descriptionAlbum = R.string.pressure_desc),
    Album(day = R.string.day_27, nameRes = R.string.silksong, imageAlbum = R.drawable.silksong_cover, descriptionAlbum = R.string.silksong_desc),
    Album(day = R.string.day_28, nameRes = R.string.expedition_33, imageAlbum = R.drawable.expedition_33_cover, descriptionAlbum = R.string.expedition_33_desc),
    Album(day = R.string.day_29, nameRes = R.string.deltarune_3_4, imageAlbum = R.drawable.deltarune_3_4_cover, descriptionAlbum = R.string.deltarune_3_4_desc),
    Album(day = R.string.day_30, nameRes = R.string.psychowarrior_mg_ultra_x, imageAlbum = R.drawable.psychowarrior_mg_ultra_x_cover, descriptionAlbum = R.string.psychowarrior_mg_ultra_x_desc),









    )