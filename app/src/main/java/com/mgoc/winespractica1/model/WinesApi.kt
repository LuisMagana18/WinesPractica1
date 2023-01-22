package com.mgoc.winespractica1.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface WinesApi {

    @GET
    fun getWines(
        @Url url: String?
    ): Call<ArrayList<Wine>>


    @GET("/wines/wines_detail/{id}")
    fun getWineDetail(
        @Path("id") id: String?
    ): Call<WineDetail>

}