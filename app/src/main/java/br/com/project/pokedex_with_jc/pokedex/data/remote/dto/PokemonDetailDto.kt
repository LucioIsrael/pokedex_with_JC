package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import br.com.project.pokedex_with_jc.domain.model.PokemonDetail
import kotlinx.serialization.SerialName

@Serializable
data class PokemonDetailDto(
    @SerialName("abilities")
    val abilities: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Ability>,
    @SerialName("base_experience")
    val baseExperience: Int,
    @SerialName("forms")
    val forms: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Form>,
    @SerialName("game_indices")
    val gameIndices: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GameIndice>,
    @SerialName("height")
    val height: Int,
    @SerialName("held_items")
    val heldItems: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.HeldItem>,
    @SerialName("id")
    val id: Int,
    @SerialName("is_default")
    val isDefault: Boolean,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String,
    @SerialName("moves")
    val moves: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Move>,
    @SerialName("name")
    val name: String,
    @SerialName("order")
    val order: Int,
    @SerialName("past_types")
    val pastTypes: List<Any>,
    @SerialName("species")
    val species: Species,
    @SerialName("sprites")
    val sprites: Sprites,
    @SerialName("stats")
    val stats: List<Stat>,
    @SerialName("types")
    val types: List<Type>,
    @SerialName("weight")
    val weight: Int
)

fun PokemonDetailDto.mapToDetailsPokemon(): PokemonDetail {
    return PokemonDetail(
        abilities = abilities,
        baseExperience = baseExperience,
        forms = forms,
        height = height,
        moves = moves,
        name = name,
        sprites = sprites,
        types = types,
        weight = weight,
        stats = stats
    )
}