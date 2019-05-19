package com.example.notas.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notas.data.GestorDeNotas
import com.example.notas.data.Nota

class NotasViewModel : ViewModel() {

    val gestorNotas = GestorDeNotas()
    private val mNotas = MutableLiveData<List<Nota>>()

    fun getNotas(): MutableLiveData<List<Nota>> = mNotas

    fun carregarNotas() {
        val tpm = gestorNotas.getNotas()
        mNotas.postValue(tpm)
    }
}