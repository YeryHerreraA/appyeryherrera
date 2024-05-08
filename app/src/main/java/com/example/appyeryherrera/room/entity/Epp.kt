package com.example.appyeryherrera.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
class Epp {
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
    var name_epp: String? = null
    var caracteristica_epp: String? = null
    var user: String? = null

    constructor(name_epp: String?, caracteristica_epp: String?, user: String?) {
        this.name_epp = name_epp
        this.caracteristica_epp = caracteristica_epp
        this.user = user
    }
}