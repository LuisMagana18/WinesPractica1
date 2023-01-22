package com.mgoc.winespractica1.model

import com.google.gson.annotations.SerializedName

data class Wine(

    @SerializedName("id")
    var id: String? = null,

    @SerializedName("thumbnail")
    var thumbnail: String? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("type")
    var type: String? = null,

    @SerializedName("age")
    var age: String? = null,

    @SerializedName("score")
    var score: String? = null

)
