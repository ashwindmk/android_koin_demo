package com.ashwin.android.koindemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ashwin.android.koindemo.R
import com.ashwin.android.koindemo.model.Computer
import kotlinx.android.synthetic.main.activity_computer.*
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class ComputerActivity : AppCompatActivity() {
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer)

        val os = intent.getStringExtra("os")
        val av = intent.getStringExtra("av")
        val proc = intent.getStringExtra("proc")
        val ram = intent.getStringExtra("ram")
        val hdd = intent.getStringExtra("hdd")

        computer = get<Computer>() { parametersOf(os, av, proc, ram, hdd) }

        computer_textview.text = computer.toString()
    }
}
