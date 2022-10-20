package es.mrmoustard.brastlewarkcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import es.mrmoustard.brastlewarkcompose.model.Gnome
import es.mrmoustard.brastlewarkcompose.model.getGnome
import es.mrmoustard.brastlewarkcompose.ui.BrastlewarkComposeApp
import es.mrmoustard.brastlewarkcompose.ui.theme.BrastlewarkComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrastlewarkComposeApp {
                GnomeList()
            }
        }
    }
}

@Composable
fun GnomeItem(item: Gnome, onClick: () -> Unit) {
    BrastlewarkComposeTheme {
        Card(
            modifier = Modifier.clickable(onClick = onClick),
            elevation = dimensionResource(id = R.dimen.card_elevation),
            border = BorderStroke(dimensionResource(id = R.dimen.card_border_stroke), Color.LightGray)
        ) {
            Column {
                Thumb(item)
                Title(item)
            }
        }
    }
}

@Composable
private fun Thumb(item: Gnome) {
    AsyncImage(
        model = item.thumbnail,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.cell_thumb_height)),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun Title(item: Gnome) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = item.name,
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview
@Composable
fun GnomeList(/*onClick: (Gnome) -> Unit, */modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_xsmall)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_xsmall)),
        modifier = modifier
    ) {
        items(getGnome()) { item ->
            GnomeItem(item = item) { /*onClick(item)*/ }
        }
    }
}