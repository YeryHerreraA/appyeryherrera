package com.example.appyeryherrera.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appyeryherrera.room.dao.DaoEpp
import com.example.appyeryherrera.room.dao.DaoUsuario
import com.example.appyeryherrera.room.entity.Epp
import com.example.appyeryherrera.room.entity.Usuario

@Database(
entities = [Usuario::class,Epp::class],
version = 1
)
abstract class Db:RoomDatabase()  {
abstract fun daoUsuario():DaoUsuario
abstract fun daoEpp():DaoEpp

}