package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    @SerialName("dream_world")
    val dreamWorld: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.DreamWorld,
    @SerialName("home")
    val home: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Home,
    @SerialName("official-artwork")
    val officialArtwork: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.OfficialArtwork
)