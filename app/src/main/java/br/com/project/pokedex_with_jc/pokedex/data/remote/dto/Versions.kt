package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Versions(
    @SerialName("generation-i")
    val generationI: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationI,
    @SerialName("generation-ii")
    val generationIi: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationIi,
    @SerialName("generation-iii")
    val generationIii: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationIii,
    @SerialName("generation-iv")
    val generationIv: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationIv,
    @SerialName("generation-v")
    val generationV: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationV,
    @SerialName("generation-vi")
    val generationVi: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationVi,
    @SerialName("generation-vii")
    val generationVii: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationVii,
    @SerialName("generation-viii")
    val generationViii: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.GenerationViii
)