package com.sem08.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Lugar(

    var id: String,
    val nombre: String,
    val correo: String?,
    val telefono: String?,
    val web: String? //el simbolo de pregunta permite nulos
) : Parcelable{
    constructor():
            this("","","","","")
}
