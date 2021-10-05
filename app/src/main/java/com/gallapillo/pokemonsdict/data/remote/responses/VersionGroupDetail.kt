package com.gallapillo.pokemonsdict.data.remote.responses


import com.gallapillo.pokemonsdict.data.remote.responses.MoveLearnMethod
import com.gallapillo.pokemonsdict.data.remote.responses.VersionGroup
import com.google.gson.annotations.SerializedName

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod,
    @SerializedName("version_group")
    val versionGroup: VersionGroup
)