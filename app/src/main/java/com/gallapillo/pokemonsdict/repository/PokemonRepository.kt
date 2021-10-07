package com.gallapillo.pokemonsdict.repository

import com.gallapillo.pokemonsdict.data.remote.PokemonApi
import com.gallapillo.pokemonsdict.data.remote.responses.Pokemon
import com.gallapillo.pokemonsdict.data.remote.responses.PokemonList
import com.gallapillo.pokemonsdict.z_utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/* Главный репозиторий приложения */
@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokemonApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int) : Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred!")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred!")
        }
        return Resource.Success(response)
    }
}