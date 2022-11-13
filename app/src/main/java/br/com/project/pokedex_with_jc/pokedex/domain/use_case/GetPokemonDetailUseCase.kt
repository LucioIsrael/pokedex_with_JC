package br.com.project.pokedex_with_jc.pokedex.domain.use_case

import br.com.project.pokedex_with_jc.pokedex.domain.model.PokemonDetail
import br.com.project.pokedex_with_jc.util.Resource
import kotlinx.coroutines.flow.Flow

interface GetPokemonDetailUseCase {
    suspend operator fun invoke(name: String): Flow<Resource<PokemonDetail>>
}
