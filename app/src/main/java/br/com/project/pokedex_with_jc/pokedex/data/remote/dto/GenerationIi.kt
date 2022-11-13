package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIi(
    @SerialName("crystal")
    val crystal: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Crystal,
    @SerialName("gold")
    val gold: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Gold,
    @SerialName("silver")
    val silver: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Silver
)