package com.example.exercicio3_casa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            val calcular = etAcao.text.toString().toDouble()*etAcao1.text.toString().toDouble()
            val resultado = "R$$calcular"
            txtTexto.text = resultado

        }
    }
}