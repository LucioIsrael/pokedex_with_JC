package br.com.project.pokedex_with_jc.pokedex.presentation.navigation

import br.com.project.pokedex_with_jc.util.Constantes.DOMINANT_COLOR
import br.com.project.pokedex_with_jc.util.Constantes.POKEMON_NAME

sealed class Screen(val route: String) {
    object PokemonList: Screen("pokemon_list_screen")
    object PokemonDetail: Screen("pokemon_detail_screen/$DOMINANT_COLOR/$POKEMON_NAME")
}
