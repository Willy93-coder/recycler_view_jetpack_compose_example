package com.example.recyclerviewjetcpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recyclerviewjetcpackcomposeexample.ui.theme.RecyclerViewJetcpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerViewJetcpackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //SimpleRecyclerView()
                    //SuperHeroView()
                    //SuperHeroGridView()
                    //SuperHeroWithSpecialControlView()
                    SuperHeroStickyView()
                }
            }
        }
    }
}