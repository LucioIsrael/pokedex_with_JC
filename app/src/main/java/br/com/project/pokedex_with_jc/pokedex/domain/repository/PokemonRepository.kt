package br.com.project.pokedex_with_jc.pokedex.domain.repository

import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonDetailDto
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonListDto

interface PokemonRepository {
    suspend fun getPokemonList(limit: String, offset: Int): PokemonListDto
    suspend fun getPokemonByName(name: String): PokemonDetailDto
}