package com.mgoc.winespractica1.model

import com.google.gson.annotations.SerializedName

data class WineDetail(
    @SerializedName("name")
    var name: String? = null,

    @SerializedName("image")
    var image: String? = null,

    @SerializedName("description")
    var description: String? = null,

    @SerializedName("type")
    var type: String? = null,

    @SerializedName("age")
    var age: String? = null,

    @SerializedName("color")
    var color: String? = null,

    @SerializedName("region")
    var region: String? = null,

    @SerializedName("pairing")
    var pairing: String? = null

)
