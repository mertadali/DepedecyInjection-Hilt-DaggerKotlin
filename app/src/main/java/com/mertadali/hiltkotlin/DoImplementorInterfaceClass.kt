package com.mertadali.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class DoImplementorInterfaceClass
@Inject constructor(@FirstImplementor private val myInterfaceImplementor : MyInterface,
                    @SecondImplementor private val mySecondInterfaceImplementor: MyInterface){

    fun myFunction() : String{
        return "Working : ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun mySecondFunction() : String{
        return "Working : ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}