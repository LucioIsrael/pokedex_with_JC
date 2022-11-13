package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIii(
    @SerialName("emerald")
    val emerald: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Emerald,
    @SerialName("firered-leafgreen")
    val fireredLeafgreen: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.FireredLeafgreen,
    @SerialName("ruby-sapphire")
    val rubySapphire: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.RubySapphire
)