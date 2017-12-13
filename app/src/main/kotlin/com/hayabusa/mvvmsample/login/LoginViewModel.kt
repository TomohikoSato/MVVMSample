package com.hayabusa.mvvmsample.login

import io.reactivex.subjects.PublishSubject

class LoginViewModel {

    val showProgress = PublishSubject.create<Void>()
    val dismissProgress = PublishSubject.create<Void>()
    val moveToLoginCompleteActivity = PublishSubject.create<Void>()


}