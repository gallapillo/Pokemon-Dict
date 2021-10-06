package com.gallapillo.pokemonsdict.viewmodel

import androidx.lifecycle.ViewModel
import com.gallapillo.pokemonsdict.data.remote.responses.Pokemon
import com.gallapillo.pokemonsdict.repository.PokemonRepository
import com.gallapillo.pokemonsdict.z_utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}