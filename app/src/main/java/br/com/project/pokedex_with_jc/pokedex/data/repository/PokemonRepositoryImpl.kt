package br.com.project.pokedex_with_jc.pokedex.data.repository

import br.com.project.pokedex_with_jc.pokedex.data.remote.PokeApi
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonDetailDto
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonListDto
import br.com.project.pokedex_with_jc.pokedex.domain.repository.PokemonRepository

class PokemonRepositoryImpl(
    private val api: PokeApi
): PokemonRepository {
    override suspend fun getPokemonList(limit: String, offset: Int): PokemonListDto {
        return api.getPokemonList(limit, offset)
    }

    override suspend fun getPokemonByName(name: String): PokemonDetailDto {
        return api.getPokemonByName(name)
    }

}