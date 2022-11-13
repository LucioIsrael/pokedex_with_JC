package br.com.project.pokedex_with_jc.pokedex.domain.model

import br.com.project.pokedex_with_jc.data.remote.dto.Result

data class PokemonList (
    val results: List<Result>
)
