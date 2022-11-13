package br.com.project.pokedex_with_jc.pokedex.domain.use_case

import br.com.project.pokedex_with_jc.pokedex.domain.model.PokemonList
import br.com.project.pokedex_with_jc.util.Resource
import kotlinx.coroutines.flow.Flow

interface GetPokemonListUseCase {
    suspend operator fun invoke(limit: String, offset: Int): Flow<Resource<PokemonList>>
}