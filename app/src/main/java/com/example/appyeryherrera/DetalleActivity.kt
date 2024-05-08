package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputLayout

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
        //generacion de referencias
        val til_det_nombre_epp = findViewById<TextInputLayout>(R.id.til_det_nombre_epp)
        val til_det_descripcion_epp = findViewById<TextInputLayout>(R.id.til_det_descripcion_epp)
        val fab_edit = findViewById<FloatingActionButton>(R.id.fab_edit)
        val fab_delete = findViewById<FloatingActionButton>(R.id.fab_delete)

        val epp:String=intent.getStringExtra("epp").toString()
        til_det_nombre_epp.editText?.setText(epp)

        //ACCION A REALIZAR TRAS PRESIONAR EL BOTON
        fab_delete.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmacion")
            builder.setMessage("¿Estas seguro de eliminar?")
            builder.setPositiveButton(android.R.string.ok){
                    dialog, wich ->
                //ACCION A REALIZAR SI PRESIONA OK
                Toast.makeText(this,"Elemento    eliminado",Toast.LENGTH_SHORT).show()
                val intent =Intent(this,UserActivity::class.java)
                startActivity(intent)
            }
            builder.setNegativeButton("Cancelar",null)
            builder.setNeutralButton("No lo se",null)
            builder.show()
        }

    }
}