package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationV(
    @SerialName("black-white")
    val blackWhite: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.BlackWhite
)