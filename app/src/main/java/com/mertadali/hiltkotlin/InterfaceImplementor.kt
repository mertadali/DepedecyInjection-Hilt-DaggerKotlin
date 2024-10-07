package com.mertadali.hiltkotlin

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor(): MyInterface {
    override fun myPrintFunction(): String {
        return "Interface Implementor String"
    }
}