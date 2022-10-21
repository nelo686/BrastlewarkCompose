package es.mrmoustard.brastlewarkcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import es.mrmoustard.brastlewarkcompose.ui.BrastlewarkComposeApp
import es.mrmoustard.brastlewarkcompose.ui.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrastlewarkComposeApp {
                Navigation()
            }
        }
    }
}
