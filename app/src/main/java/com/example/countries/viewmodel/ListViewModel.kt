package com.example.countries.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        fetchCountries()
    }

    private fun fetchCountries(){

        val mockData = listOf(Country("Polska"),
            Country("Anglia"),
            Country("Francja"),
            Country("Węgry"),
            Country("Czechy"),
            Country("Słowacja"),
            Country("Chorwacja"),
            Country("Grecja")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData

    }


}