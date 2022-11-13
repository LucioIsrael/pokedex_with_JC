package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Move(
    @SerialName("move")
    val move: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.MoveX,
    @SerialName("version_group_details")
    val versionGroupDetails: List<br.com.project.pokedex_with_jc.pokedex.data.remote.dto.VersionGroupDetail>
)