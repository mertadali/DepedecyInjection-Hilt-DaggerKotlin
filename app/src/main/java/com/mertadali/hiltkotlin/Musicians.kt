package com.mertadali.hiltkotlin

import javax.inject.Inject
import javax.inject.Singleton

/*
Hilt currently supports the following Android classes:

Application (by using @HiltAndroidApp)
ViewModel (by using @HiltViewModel)
Activity
Fragment
View
Service
BroadcastReceiver

 */

@Singleton
class Musicians
    @Inject
    constructor(band : Band, instrument : Instruments)
    {

    fun sing(){
        println("Dependency Injection is Library, Hilt is framework")
    }
}