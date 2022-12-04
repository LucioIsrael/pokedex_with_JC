package br.com.project.pokedex_with_jc.pokedex.domain.use_case

import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonListDto
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.mapToPokemon
import br.com.project.pokedex_with_jc.pokedex.domain.model.PokemonList
import br.com.project.pokedex_with_jc.pokedex.domain.repository.PokemonRepository
import br.com.project.pokedex_with_jc.util.Constantes.HTTP_ERROR
import br.com.project.pokedex_with_jc.util.Constantes.IO_ERROR
import br.com.project.pokedex_with_jc.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPokemonListUseCaseImpl @Inject constructor(
    private val pokemonRepository: PokemonRepository
): GetPokemonListUseCase {
    override fun invoke(): Flow<Resource<PokemonList>> = flow {
        try {
            emit(Resource.Loading<PokemonList>())
            val pokemonListDto: PokemonListDto = pokemonRepository.getPokemonList()
            val pokemonList = pokemonListDto.mapToPokemon()
            emit(Resource.Sucess<PokemonList>(pokemonList))
        } catch (e: HttpException) {
            emit(Resource.Error<PokemonList>(HTTP_ERROR))
        } catch (e: IOException) {
            emit(Resource.Error<PokemonList>(IO_ERROR))
        }
    }
}