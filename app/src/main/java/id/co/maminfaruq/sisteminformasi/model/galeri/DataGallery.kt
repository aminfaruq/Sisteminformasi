package id.co.maminfaruq.sisteminformasi.model.galeri

import com.google.gson.annotations.SerializedName

data class DataGallery(

	@field:SerializedName("judul_gallery")
	val judulGallery: String? = null,

	@field:SerializedName("id_gallery")
	val idGallery: String? = null,

	@field:SerializedName("gallery")
	val gallery: String? = null
)