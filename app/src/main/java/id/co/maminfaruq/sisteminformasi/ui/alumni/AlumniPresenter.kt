package id.co.maminfaruq.sisteminformasi.ui.alumni

import id.co.maminfaruq.sisteminformasi.model.alumni.ResponseAlumni
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AlumniPresenter(model : AlumniContract.View) : AlumniContract.Presenter {

    var view : AlumniContract.View? = null

    init {
        view = model
    }

    override fun getAlumni() {
        val apiInterface = ApiClient.create()

        apiInterface.getAlumni()
                .enqueue(object : Callback<ResponseAlumni>{
                    override fun onResponse(call: Call<ResponseAlumni>?, response: Response<ResponseAlumni>?) {
                        val alumni : ResponseAlumni = response?.body()!!

                        if (response.isSuccessful){
                            view?.showAlumni(alumni.data!!)
                        }
                    }

                    override fun onFailure(call: Call<ResponseAlumni>?, t: Throwable?) {

                    }

                })
    }
}