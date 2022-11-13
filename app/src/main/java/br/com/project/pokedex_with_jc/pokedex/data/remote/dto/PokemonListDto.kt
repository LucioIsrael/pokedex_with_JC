package br.com.project.pokedex_with_jc.pokedex.data.remote.dto

import br.com.project.pokedex_with_jc.domain.model.PokemonList
import kotlinx.serialization.SerialName

@Serializable
data class PokemonListDto(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: Any,
    @SerialName("results")
    val results: List<Result>
)

fun PokemonListDto.mapToPokemon(): PokemonList {
    return PokemonList(
        results = results
    )
}