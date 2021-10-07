package com.gallapillo.pokemonsdict

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/* Класс приложения */
@HiltAndroidApp
class PokemonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}