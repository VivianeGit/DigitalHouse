package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreate.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java )
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val email = txtEmailLogin.text.toString()
            val password = txtPasswordLogin.text.toString()
            val usuario = UserService.logIn(email, password)

            if (usuario != null){
                val intent = Intent (this, MainActivity3::class.java)
                intent.putExtra("NAME", "Vivi")
                startActivity(intent)
            } else
                Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()

        }

    }
}
