package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeldItem(
    @SerialName("item")
    val item: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.Item,
    @SerialName("version_details")
    val versionDetails: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.VersionDetail>
)