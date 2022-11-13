package br.com.project.pokedex_with_jc.pokedex.domain.use_case

data class PokedexUseCases(
    val getPokemonList: GetPokemonListUseCase,
    val getPokemonDetail: GetPokemonDetailUseCase
)
