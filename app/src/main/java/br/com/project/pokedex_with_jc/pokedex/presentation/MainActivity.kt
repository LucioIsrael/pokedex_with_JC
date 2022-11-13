package br.com.project.pokedex_with_jc.pokedex.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.project.pokedex_with_jc.pokedex.presentation.navigation.PokedexNavigation
import com.plcoding.jetpackcomposepokedex.ui.theme.Pokedex
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pokedex {
                PokedexNavigation()
            }
        }
    }
}
