package es.mrmoustard.brastlewarkcompose.ui.screen.main

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import es.mrmoustard.brastlewarkcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppBar() {
    TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
}