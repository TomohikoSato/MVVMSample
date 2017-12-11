package com.hayabusa.mvvmsample

import com.hayabusa.mvvmsample.di.AppModule
import com.hayabusa.mvvmsample.di.DaggerAppComponent
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector() =
            DaggerAppComponent
                    .builder()
                    .appModule(AppModule(this))
                    .build()

}