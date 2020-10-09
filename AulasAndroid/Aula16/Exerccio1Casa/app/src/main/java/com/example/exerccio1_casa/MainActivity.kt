package com.example.exerccio1_casa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val  MEUNOME = "Meu nome é"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExibir.setOnClickListener {
            val resultadoDoNome = etAcao.text.toString()

            when {
                resultadoDoNome.isNotEmpty() -> {
                    txtTexto.visibility = View.VISIBLE

                    txtTexto.text = ("$MEUNOME $resultadoDoNome")
                }
                else-> {
                    etAcao.error = "Preencha o campo ai meu"
                }
            }
        }

        btnRestart.setOnClickListener {
            txtTexto.visibility = View.GONE
        }
    }
}