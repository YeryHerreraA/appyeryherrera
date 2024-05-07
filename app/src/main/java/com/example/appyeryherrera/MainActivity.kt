package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //referencias a los widget
        val btn_iniciar_sesion_login = findViewById<Button>(R.id.btn_iniciar_sesion_login)
        val btn_registrarse_login = findViewById<Button>(R.id.btn_registrarse_login)
        val til_email = findViewById<TextInputLayout>(R.id.til_email)
        val til_pass = findViewById<TextInputLayout>(R.id.til_pass)
        val sw_recordar = findViewById<Switch>(R.id.sw_recordar)



        
        btn_iniciar_sesion_login.setOnClickListener{
            var email=til_email.editText?.text.toString()
            var pass=til_pass.editText?.text.toString()
            Toast.makeText(this, email+""+pass, Toast.LENGTH_SHORT).show()
            println("{$email} ${pass}")
            //val intent = Intent(this@MainActivity,UserActivity::class.java)
            //startActivity(intent)
        }
        btn_registrarse_login.setOnClickListener{
            val intent = Intent(this@MainActivity,RegistrarUsuarioActivity::class.java)
            startActivity(intent)
        }



    }

    //Ciclo de vida de la actividad
    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        println("onDestroy()")
        super.onDestroy()

    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        println("onResume")
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        println("onRestart")
    }
    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
        println("onPause()")
    }
    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
        println("onStop()")
    }


}
