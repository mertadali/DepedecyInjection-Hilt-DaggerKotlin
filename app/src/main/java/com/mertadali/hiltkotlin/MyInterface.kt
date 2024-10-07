package com.mertadali.hiltkotlin

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String
}


@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImplementor()

    }


    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface {
        return SecondInterfaceImplementor()

    }




}

// Anotasyon

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor()


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor()