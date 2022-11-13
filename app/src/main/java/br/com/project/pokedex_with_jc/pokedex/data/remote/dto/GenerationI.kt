package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationI(
    @SerialName("red-blue")
    val redBlue: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.RedBlue,
    @SerialName("yellow")
    val yellow: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Yellow
)