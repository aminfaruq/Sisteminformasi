package id.co.maminfaruq.sisteminformasi.model.alumni

import com.google.gson.annotations.SerializedName

data class ResponseAlumni(

		@field:SerializedName("result")
	val result: Int? = null,

		@field:SerializedName("data")
	val data: List<DataAlumni>? = null,

		@field:SerializedName("message")
	val message: String? = null
)