package com.hayabusa.mvvmsample.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module()
class AppModule(private val application: Application) {

    @Provides
    fun provideApplication(): Application = application

    @Provides
    fun provideContext(application: Application): Context = application
}
