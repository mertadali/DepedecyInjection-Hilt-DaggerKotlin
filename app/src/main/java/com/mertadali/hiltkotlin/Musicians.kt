package com.mertadali.hiltkotlin

import javax.inject.Inject


class Musicians
    @Inject
    constructor(band : Band, instrument : Instruments)
    {

    fun sing(){
        println("Dependency Injection is Library, Hilt is framework")
    }
}