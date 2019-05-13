package com.example.laboratorio7android

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class InventariosViewModel(private val mInventario: MutableLiveData<List<String>>) : ViewModel() {

    fun getInventario(): LiveData<List<String>>{
        return mInventario
    }

}
