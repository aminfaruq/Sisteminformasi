package id.co.maminfaruq.sisteminformasi.model.galeri

import com.google.gson.annotations.SerializedName

data class ResponseGallery(

		@field:SerializedName("result")
	val result: Int? = null,

		@field:SerializedName("data")
	val data: List<DataGallery>? = null,

		@field:SerializedName("message")
	val message: String? = null
)