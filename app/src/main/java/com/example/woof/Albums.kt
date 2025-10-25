package com.example.woof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.woof.musicdata.Album
import com.example.woof.musicdata.albums
import com.example.woof.ui.theme.WoofTheme
import com.example.woof.R

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MusicApp()
                }
            }
        }
    }
}

@Composable
fun MusicApp() {
    Scaffold(
        topBar = { MusicTopAppBar() }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(albums) { album ->
                AlbumCard(
                    album = album,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}

@Composable
fun AlbumCard(
    album: Album,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            )
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            // 1 строка — день
            Text(
                text = stringResource(album.day),
                style = MaterialTheme.typography.displaySmall
            )

            // 2 строка — название альбома
            Text(
                text = stringResource(album.nameRes),
                style = MaterialTheme.typography.displayMedium,
            )

            // 3 строка — обложка альбома
            Image(
                painter = painterResource(album.imageAlbum),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = dimensionResource(R.dimen.padding_small))
                    .fillMaxWidth()
                    .fillMaxSize()
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            // Раскрывающаяся часть
            if (expanded) {
                Text(
                    text = stringResource(album.descriptionAlbum),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(
                        top = dimensionResource(R.dimen.padding_small),
                        bottom = dimensionResource(R.dimen.padding_medium)
                    )
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MusicTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = stringResource(R.string.app_name_music),
                    style = MaterialTheme.typography.displayLarge,
                    textAlign = TextAlign.Center,
                )
            }
        },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MusicPreview() {
    WoofTheme {
        MusicApp()
    }
}
