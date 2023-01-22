package com.mgoc.winespractica1.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {

    const val BASE_URL = "https://private-2e4ef-wines1.apiary-mock.com/"  //Para conectar con Apiary

    const val LOGTAG = "LOGS"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}