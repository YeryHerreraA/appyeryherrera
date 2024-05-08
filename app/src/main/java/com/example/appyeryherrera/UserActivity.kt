package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //referencias a los widgets

        val tv_bienvenido_user = findViewById<TextView>(R.id.tv_bienvenido_user)
        val sp_tipo_epp_user = findViewById<Spinner>(R.id.sp_tipo_epp_user)
        val lv_epp_user = findViewById<ListView>(R.id.lv_epp_user)
        val fab_add = findViewById<FloatingActionButton>(R.id.fab_add)

        val correo:String = intent.getStringExtra("correo").toString()
        tv_bienvenido_user.setText("Bienvenido $correo")


        fab_add.setOnClickListener{
            val intent = Intent(this@UserActivity,RegistrarEppActivity::class.java)
            startActivity(intent)
        }

        lv_epp_user.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long)
             {
               val intent = Intent(this@UserActivity,DetalleActivity::class.java)
        startActivity(intent)
            }


        }


    }
}