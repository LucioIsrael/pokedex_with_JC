package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIv(
    @SerialName("diamond-pearl")
    val diamondPearl: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.DiamondPearl,
    @SerialName("heartgold-soulsilver")
    val heartgoldSoulsilver: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.HeartgoldSoulsilver,
    @SerialName("platinum")
    val platinum: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Platinum
)