package id.co.maminfaruq.sisteminformasi.model.program

import com.google.gson.annotations.SerializedName

data class ResponseProgram(

		@field:SerializedName("result")
	val result: Int? = null,

		@field:SerializedName("data")
	val data: List<DataProgram>? = null,

		@field:SerializedName("message")
	val message: String? = null
)