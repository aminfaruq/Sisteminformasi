package id.co.maminfaruq.sisteminformasi.model.info

import com.google.gson.annotations.SerializedName

class ResponseInfo (


    @field:SerializedName("result")
    val result: Int? = null,

    @field:SerializedName("data")
    val data: List<DataInfo>? = null,

    @field:SerializedName("message")
    val message: String? = null
)
