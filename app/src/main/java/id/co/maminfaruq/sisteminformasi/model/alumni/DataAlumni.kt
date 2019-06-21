package id.co.maminfaruq.sisteminformasi.model.alumni

import com.google.gson.annotations.SerializedName

data class DataAlumni(

	@field:SerializedName("asal")
	val asal: String? = null,

	@field:SerializedName("foto_alumni")
	val fotoAlumni: String? = null,

	@field:SerializedName("id_alumni")
	val idAlumni: String? = null,

	@field:SerializedName("bio")
	val bio: String? = null,

	@field:SerializedName("nama_alumni")
	val namaAlumni: String? = null
)