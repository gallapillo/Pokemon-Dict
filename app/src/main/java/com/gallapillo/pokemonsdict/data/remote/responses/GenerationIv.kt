package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.gallapillo.pokemonsdict.data.remote.responses.DiamondPearl
import com.gallapillo.pokemonsdict.data.remote.responses.HeartgoldSoulsilver
import com.gallapillo.pokemonsdict.data.remote.responses.Platinum
import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)