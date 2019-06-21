package id.co.maminfaruq.sisteminformasi.model.profil

import com.google.gson.annotations.SerializedName

data class ResponseProfile(

		@field:SerializedName("result")
	    val result: Int? = null,

		@field:SerializedName("data")
	    val data: List<DataProfil>? = null,

		@field:SerializedName("message")
	    val message: String? = null
)
