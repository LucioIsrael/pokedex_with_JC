package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilityX(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)