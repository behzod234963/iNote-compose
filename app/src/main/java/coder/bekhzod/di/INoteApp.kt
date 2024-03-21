package coder.bekhzod.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class INoteApp: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}