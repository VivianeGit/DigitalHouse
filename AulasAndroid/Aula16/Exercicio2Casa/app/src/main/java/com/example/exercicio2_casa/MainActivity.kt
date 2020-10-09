package com.example.exercicio2_casa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener {
        val convertido = 32 + (etAcao.text.toString().toDouble() * 9) / 5
            etAcao.setText("")
            val resultado = etAcao.text.toString() + " " + convertido + "°F"
            txtTexto.text = resultado


        }
    }
}
