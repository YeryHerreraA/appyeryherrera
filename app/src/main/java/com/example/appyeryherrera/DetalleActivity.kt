package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fab_edit = findViewById<FloatingActionButton>(R.id.fab_edit)
        val fab_delete = findViewById<FloatingActionButton>(R.id.fab_delete)


        fab_edit.setOnClickListener{
            val intent = Intent(this@DetalleActivity,UserActivity::class.java)
            startActivity(intent)
        }

        fab_delete.setOnClickListener{
            val intent = Intent(this@DetalleActivity,UserActivity::class.java)
            startActivity(intent)
        }
    }
}