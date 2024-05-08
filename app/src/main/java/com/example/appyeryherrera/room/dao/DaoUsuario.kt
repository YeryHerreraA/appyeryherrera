package com.example.appyeryherrera.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appyeryherrera.room.entity.Usuario
@Dao
interface DaoUsuario {
    @Query("SELECT * FROM Usuario")
    //METODO APRA OBTENER LA INFO
    //suspend son las corrutinas estas son una de las características más impresionantes de Kotlin is simply a function that can be paused and resumed
    fun obtenerUsuario(): List<Usuario>

    @Query("SELECT * FROM Usuario WHERE correo=:correo")
    fun obtenerUsuario(correo: String): List<Usuario>

    @Query("SELECT * FROM Usuario WHERE correo=:correo AND password=:contrasena")
    fun login(correo: String, contrasena: String): List<Usuario>

    @Insert
    fun agregarUsuario(usuario: Usuario):Long

    //=: nos permite parametrizar


}