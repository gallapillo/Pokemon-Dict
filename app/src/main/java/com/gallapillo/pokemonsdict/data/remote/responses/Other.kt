package com.gallapillo.pokemonsdict.data.remote.responses


import com.gallapillo.pokemonsdict.data.remote.responses.DreamWorld
import com.gallapillo.pokemonsdict.data.remote.responses.OfficialArtwork
import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)