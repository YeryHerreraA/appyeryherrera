package com.example.appyeryherrera

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
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

        //ARRAY ADAPTER SPINNER
        //GENERACION DEL SPINNER
        val arrayAdapterSpinner: ArrayAdapter<*>
        //definicion de un arreglo
        var tipoepp = ArrayList<String>()
        tipoepp.add("Todas las opciones")
        tipoepp.add("Cabeza")
        tipoepp.add("Cuerpo")
        tipoepp.add("Pies")
        //inflamos el spiner
        arrayAdapterSpinner = ArrayAdapter(this@UserActivity, android.R.layout.simple_spinner_dropdown_item,tipoepp)
        sp_tipo_epp_user.adapter = arrayAdapterSpinner

        //ARRAY ADAPTER LISTVIEW
        //GENERACION DEL LISTVIEW
        val arrayAdapterListview: ArrayAdapter<*>
        //definicion de un arreglo
        var epp = ArrayList<String>()
        epp.add("casco minero")
        epp.add("lentes claros")
        epp.add("protector auditivo fono")
        epp.add("lampara minera")
        //inflar el listview
        arrayAdapterListview = ArrayAdapter(this@UserActivity, android.R.layout.simple_list_item_1,epp)
        lv_epp_user.adapter = arrayAdapterListview

        // metodo onlist lisview
        lv_epp_user.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                println("${position} ${id} ${epp[position]}")
                val intent = Intent(this@UserActivity,DetalleActivity::class.java)
                intent.putExtra("epp",epp[position])
                startActivity(intent)
            }
        }

        // Evento boton añadir



         fab_add.setOnClickListener{
             startActivity(Intent(this@UserActivity,RegistrarEppActivity::class.java))

         }






    }
}