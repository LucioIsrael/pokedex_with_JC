package br.com.project.pokedex_with_jc.pokedex.domain.model

import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Ability
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Form
import br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Move
import br.com.project.pokedex_with_jc.data.remote.dto.Sprites
import br.com.project.pokedex_with_jc.data.remote.dto.Type
import br.com.project.pokedex_with_jc.data.remote.dto.Stat

data class PokemonDetail(
    val abilities: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Ability>,
    val baseExperience: Int,
    val forms: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Form>,
    val height: Int,
    val moves: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Move>,
    val name: String,
    val sprites: Sprites,
    val types: List<Type>,
    val weight: Int,
    val stats: List<Stat>
)
