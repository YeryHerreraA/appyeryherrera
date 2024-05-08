package com.example.appyeryherrera.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appyeryherrera.room.entity.Epp

@Dao
interface DaoEpp {
    @Query("SELECT * FROM Epp")
    fun obtenerEpps() : List<Epp>

    @Query("SELECT * FROM Epp WHERE user=:user")
    fun obtenerEppUsuario(user:String):List<Epp>

   //spiner selecion de tipo epp
@Query("SELECT * FROM epp WHERE name_epp=:name AND user=:user")
fun obtenerEppPorNombre(name:String, user : String):List<Epp>

@Insert
fun agregarEpp(epp: Epp):Long

@Query("UPDATE Epp SET name_epp=:name, caracteristica_epp=:caracter WHERE id=:id ")

fun actualizarEpp(name:String,caracter: String,id:Long):Int


@Query("DELETE FROM epp WHERE id=:id")
fun eliminarEpp(id:Long)


}