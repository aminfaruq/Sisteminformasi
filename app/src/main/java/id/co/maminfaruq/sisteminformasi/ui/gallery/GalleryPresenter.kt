package id.co.maminfaruq.sisteminformasi.ui.gallery

import id.co.maminfaruq.sisteminformasi.model.alumni.ResponseAlumni
import id.co.maminfaruq.sisteminformasi.model.galeri.ResponseGallery
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GalleryPresenter(model : GalleryContract.View) : GalleryContract.Presenter {

    var view : GalleryContract.View? = null

    init {
        view = model
    }
    override fun getGallery() {
        val apiInterface = ApiClient.create()

        apiInterface.getGallery()
                .enqueue(object : Callback<ResponseGallery>{
                    override fun onResponse(call: Call<ResponseGallery>?, response: Response<ResponseGallery>?) {
                        val gallery : ResponseGallery = response?.body()!!

                        if (response.isSuccessful){
                            view?.showGallery(gallery.data!!)
                        }

                    }

                    override fun onFailure(call: Call<ResponseGallery>?, t: Throwable?) {

                    }
                })
    }
}