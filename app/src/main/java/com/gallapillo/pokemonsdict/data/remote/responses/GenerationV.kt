package com.gallapillo.pokemonsdict.data.remote.responses


import com.gallapillo.pokemonsdict.data.remote.responses.BlackWhite
import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)