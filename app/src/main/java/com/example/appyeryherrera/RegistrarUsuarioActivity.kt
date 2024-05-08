package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class RegistrarUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registrar_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //referencias a los widgeds
        val btn_register_user = findViewById<Button>(R.id.btn_register_user)
        val til_correo_register = findViewById<TextInputLayout>(R.id.til_correo_register)
        val til_user_register = findViewById<TextInputLayout>(R.id.til_user_register )
        val til_fechanac_register = findViewById<TextInputLayout>(R.id.til_fechanac_register)
        val til_contrasena_register = findViewById<TextInputLayout>(R.id.til_contrasena_register)
        val til_rcontrasena_register = findViewById<TextInputLayout>(R.id.til_rcontrasena_register)
        val sw_aceptar_terminos_register = findViewById<Switch>(R.id.sw_aceptar_terminos_register)


        btn_register_user.setOnClickListener {

            var email = til_correo_register.editText?.text.toString()
            var name = til_user_register.editText?.text.toString()
            var pass = til_contrasena_register.editText?.text.toString()
            var rpass = til_rcontrasena_register.editText?.text.toString()

            println("${email} ${name} ${pass} ${rpass}")


            val intent = Intent(this@RegistrarUsuarioActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}