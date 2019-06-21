package id.co.maminfaruq.sisteminformasi.model.profil

import com.google.gson.annotations.SerializedName

data class DataProfil(

		@field:SerializedName("id_profil")
	    val idProfil: String? = null,

		@field:SerializedName("foto_sekolah")
	    val fotoSekolah: String? = null,

		@field:SerializedName("nama_sekolah")
	    val namaSekolah: String? = null,

		@field:SerializedName("deskripsi_sekolah")
		val deskripsiSekolah: String? = null
)
