package es.mrmoustard.brastlewarkcompose.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import es.mrmoustard.brastlewarkcompose.ui.theme.BrastlewarkComposeTheme

@Composable
fun BrastlewarkComposeApp(content: @Composable () -> Unit) {
    BrastlewarkComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}