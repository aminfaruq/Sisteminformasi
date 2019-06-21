package id.co.maminfaruq.sisteminformasi.model.info

import com.google.gson.annotations.SerializedName

data class DataInfo (

    @field:SerializedName("id_info")
    val idInfo: String? = null,

    @field:SerializedName("foto_prestasi")
    val fotoPrestasi: String? = null,

    @field:SerializedName("nama_pretasi")
    val namaPrestasi: String? = null,

    @field:SerializedName("deskripsi_prestasi")
    val deskripsiPrestasi: String? = null

)
