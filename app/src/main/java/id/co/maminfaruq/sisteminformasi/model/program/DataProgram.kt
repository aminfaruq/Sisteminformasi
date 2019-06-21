package id.co.maminfaruq.sisteminformasi.model.program

import com.google.gson.annotations.SerializedName

data class DataProgram(

	@field:SerializedName("judul_program")
	val judulProgram: String? = null,

	@field:SerializedName("deskripsi_program")
	val deskripsiProgram: String? = null,

	@field:SerializedName("id_program")
	val idProgram: String? = null,

	@field:SerializedName("foto_program")
	val fotoProgram: String? = null
)