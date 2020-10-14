package com.example.aula19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = intent.getStringExtra("Viviane")
        val idade = intent.getIntExtra(25)

        txtTest.text = name + " " idade
    }
}