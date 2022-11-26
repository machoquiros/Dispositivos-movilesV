package com.sem08.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sem08.data.LugarDao
import com.sem08.model.Lugar

class LugarRepository (private val lugarDao: LugarDao){
    fun guardarLugar(lugar: Lugar){
        lugarDao.guardarLugar(lugar)
    }

    fun eliminarLugar(lugar: Lugar){
        lugarDao.eliminarLugar(lugar)
    }

    val obtenerLugares: MutableLiveData<List<Lugar>> = lugarDao.getLugares()
}