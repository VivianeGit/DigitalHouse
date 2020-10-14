package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnLogIn.setOnClickListener {
            finish()
        }

        Check.setOnCheckedChangeListener { _, b ->
            btnSingUp.isEnabled = b
        }
        btnSingUp.setOnClickListener {
            val name = txtNameSingUp.text.toString()
            val email = txtEmailSingUp.text.toString()
            val password = txtPasswordSingUp.text.toString()

            if (name.isEmpty()) {
                txtNameSingUp.error = "Campo vazio"
            } else {
                try {
                    UserService.register(name, email, password)
                    Toast.makeText(this, "Usuário cadastrado!", Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }


            }

        }
    }
}

