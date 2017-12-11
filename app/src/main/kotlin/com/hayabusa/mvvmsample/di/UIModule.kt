package com.hayabusa.mvvmsample.di

import com.hayabusa.mvvmsample.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Activity or Fragmentを管理するModule
 */
@Module
abstract class UIModule {
    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): LoginActivity
}