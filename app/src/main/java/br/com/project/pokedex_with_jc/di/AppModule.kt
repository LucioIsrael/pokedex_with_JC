package br.com.project.pokedex_with_jc.di

import br.com.project.pokedex_with_jc.pokedex.data.remote.PokeApi
import br.com.project.pokedex_with_jc.pokedex.data.repository.PokemonRepositoryImpl
import br.com.project.pokedex_with_jc.pokedex.domain.repository.PokemonRepository
import br.com.project.pokedex_with_jc.pokedex.domain.use_case.*
import br.com.project.pokedex_with_jc.util.Constantes.BASE_URL
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepositoryImpl(api)

    @Singleton
    @Provides
    fun providePokemonApi(): PokeApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

    @Provides
    @Singleton
    fun providePokedexUseCases(repository: PokemonRepository): PokedexUseCases {
        return PokedexUseCases(
            getPokemonList = GetPokemonListUseCaseImpl(repository),
            getPokemonDetail = GetPokemonDetailUseCaseImpl(repository)
        )
    }

}