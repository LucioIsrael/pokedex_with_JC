package br.com.project.pokedex_with_jc.pokedex.data.remote

import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonDetailDto
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.PokemonListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: String,
        @Query("offset") offset: Int
    ): PokemonListDto

    @GET("pokemon/{name}")
    suspend fun getPokemonByName(@Path("name") name: String): PokemonDetailDto

}
