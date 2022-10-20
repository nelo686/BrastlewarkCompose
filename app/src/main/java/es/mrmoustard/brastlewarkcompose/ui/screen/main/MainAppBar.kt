package es.mrmoustard.brastlewarkcompose.ui.screen.main

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import es.mrmoustard.brastlewarkcompose.R

@Composable
fun MainAppBar() {
    TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
}