package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionGroupDetail(
    @SerialName("level_learned_at")
    val levelLearnedAt: Int,
    @SerialName("move_learn_method")
    val moveLearnMethod: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.MoveLearnMethod,
    @SerialName("version_group")
    val versionGroup: VersionGroup
)