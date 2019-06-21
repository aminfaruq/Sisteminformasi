package id.co.maminfaruq.sisteminformasi.network

import id.co.maminfaruq.sisteminformasi.model.alumni.ResponseAlumni
import id.co.maminfaruq.sisteminformasi.model.galeri.ResponseGallery
import id.co.maminfaruq.sisteminformasi.model.info.ResponseInfo
import id.co.maminfaruq.sisteminformasi.model.profil.ResponseProfile
import id.co.maminfaruq.sisteminformasi.model.program.ResponseProgram
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("getprofil.php")
    fun getProfil(): Call<ResponseProfile>

    @GET("getinfo.php")
    fun getInfo(): Call<ResponseInfo>

    @GET("getgallery.php")
    fun getGallery(): Call<ResponseGallery>

    @GET("getprogram.php")
    fun getProgram(): Call<ResponseProgram>

    @GET("getalumni.php")
    fun getAlumni(): Call<ResponseAlumni>
}