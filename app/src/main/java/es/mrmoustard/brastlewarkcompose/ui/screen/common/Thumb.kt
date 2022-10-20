package es.mrmoustard.brastlewarkcompose.ui.screen.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import coil.compose.AsyncImage
import es.mrmoustard.brastlewarkcompose.R
import es.mrmoustard.brastlewarkcompose.model.Gnome

@Composable
fun Thumb(item: Gnome, modifier: Modifier = Modifier) {
    AsyncImage(
        model = item.thumbnail,
        contentDescription = null,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.cell_thumb_height))
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}