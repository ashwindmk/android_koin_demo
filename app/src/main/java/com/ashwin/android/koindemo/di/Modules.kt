package com.ashwin.android.koindemo.di

import com.ashwin.android.koindemo.model.Computer
import com.ashwin.android.koindemo.model.Cover
import com.ashwin.android.koindemo.model.Hardware
import com.ashwin.android.koindemo.model.Software
import org.koin.dsl.module

val computerModule = module {
    fun provideSoftware(os: String, av: String): Software {
        return Software(os, av)
    }

    fun provideHardware(proc: String, ram: String, hdd: String): Hardware {
        return Hardware(proc, ram, hdd)
    }

    single { Cover() }

    factory { (os: String, av: String, proc: String, ram: String, hdd: String) -> Computer(provideSoftware(os, av), provideHardware(proc, ram, hdd), get()) }
}
