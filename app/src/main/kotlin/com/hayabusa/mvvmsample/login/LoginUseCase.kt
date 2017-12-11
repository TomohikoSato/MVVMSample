package com.hayabusa.mvvmsample.login

import io.reactivex.Completable
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class LoginUseCase @Inject constructor() {

    fun login(loginParam: LoginParam): Completable =
            Completable.timer(5, TimeUnit.SECONDS)
}