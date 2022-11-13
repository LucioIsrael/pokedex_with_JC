package br.com.project.pokedex_with_jc.pokedex.domain.use_case

import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonDetailDto
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.mapToDetailsPokemon
import br.com.project.pokedex_with_jc.pokedex.domain.model.PokemonDetail
import br.com.project.pokedex_with_jc.pokedex.domain.repository.PokemonRepository
import br.com.project.pokedex_with_jc.util.Constantes.HTTP_ERROR
import br.com.project.pokedex_with_jc.util.Constantes.IO_ERROR
import br.com.project.pokedex_with_jc.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPokemonDetailUseCaseImpl @Inject constructor(
    private val pokemonRepository: PokemonRepository
) : GetPokemonDetailUseCase {
    override suspend fun invoke(name: String): Flow<Resource<PokemonDetail>> = flow {
        try {
            emit(Resource.Loading<PokemonDetail>())
            val pokemonDetailDto: PokemonDetailDto = pokemonRepository.getPokemonByName(name)
            val pokemonDetail = pokemonDetailDto.mapToDetailsPokemon()
            emit(Resource.Sucess<PokemonDetail>(pokemonDetail))
        } catch (e: HttpException) {
            emit(Resource.Error<PokemonDetail>(HTTP_ERROR))
        } catch (e: IOException) {
            emit(Resource.Error<PokemonDetail>(IO_ERROR))
        }
    }
}
