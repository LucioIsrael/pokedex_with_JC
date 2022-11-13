package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationVii(
    @SerialName("icons")
    val icons: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Icons,
    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.UltraSunUltraMoon
)