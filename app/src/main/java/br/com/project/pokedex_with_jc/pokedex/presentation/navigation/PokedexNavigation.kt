package br.com.project.pokedex_with_jc.pokedex.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import br.com.project.pokedex_with_jc.pokedex.presentation.list_pokemons.components.PokemonListScreen
import br.com.project.pokedex_with_jc.util.Constantes.DOMINANT_COLOR
import br.com.project.pokedex_with_jc.util.Constantes.POKEMON_NAME

@Composable
fun PokedexNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.PokemonList.route
    ) {
        composable(Screen.PokemonList.route) {
            PokemonListScreen(navController = navController)
        }
        composable(
            Screen.PokemonDetail.route,
            arguments = listOf(
                navArgument(DOMINANT_COLOR) {
                    type = NavType.IntType
                },
                navArgument(POKEMON_NAME) {
                    type = NavType.StringType
                }
            )
        ) {
            val dominantColor = remember {
                val color = it.arguments?.getInt(DOMINANT_COLOR)
                color?.let { Color(it) } ?: Color.White
            }
            val pokemonName = remember {
                it.arguments?.getString(POKEMON_NAME)
            }
        }
    }
}