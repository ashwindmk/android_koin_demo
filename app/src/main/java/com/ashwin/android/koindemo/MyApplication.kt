package com.ashwin.android.koindemo

import android.app.Application
import com.ashwin.android.koindemo.di.computerModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(computerModule))
        }
    }
}