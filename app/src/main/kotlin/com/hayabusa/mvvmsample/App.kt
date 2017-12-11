package com.hayabusa.mvvmsample

import com.hayabusa.mvvmsample.di.AppModule
import com.hayabusa.mvvmsample.di.DaggerAppComponent
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector() =
            DaggerAppComponent.builder()
                    .application(this)
                    .appModule(AppModule(this))
                    .build()

    override fun onCreate() {
        super.onCreate()
    }
}