package br.com.project.pokedex_with_jc.pokedex.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationVi(
    @SerialName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.OmegarubyAlphasapphire,
    @SerialName("x-y")
    val xY: br.com.project.pokedex_with_jc.pokedex.data.remote.dto.XY
)