package br.com.project.pokedex_with_jc

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree

@HiltAndroidApp
class PokemonApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(DebugTree())
    }
}