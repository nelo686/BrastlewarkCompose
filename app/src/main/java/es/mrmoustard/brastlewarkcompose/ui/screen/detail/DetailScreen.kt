package es.mrmoustard.brastlewarkcompose.ui.screen.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import es.mrmoustard.brastlewarkcompose.model.getGnome
import es.mrmoustard.brastlewarkcompose.ui.screen.common.ArrowBackIcon
import es.mrmoustard.brastlewarkcompose.ui.screen.common.Thumb

@Composable
fun DetailScreen(itemId: Int, onUpClick: () -> Unit) {
    val gnome = remember { getGnome().first { it.id == itemId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = gnome.name) },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        }
    ) { padding ->
        Thumb(item = gnome, Modifier.padding(paddingValues = padding))
    }
}