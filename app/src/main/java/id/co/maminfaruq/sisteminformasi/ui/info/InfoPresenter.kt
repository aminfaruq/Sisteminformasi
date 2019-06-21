package id.co.maminfaruq.sisteminformasi.ui.info

import id.co.maminfaruq.sisteminformasi.model.info.ResponseInfo
import id.co.maminfaruq.sisteminformasi.model.profil.ResponseProfile
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InfoPresenter(model : InfoContract.View) : InfoContract.Presenter {

    var view : InfoContract.View? = null

    init {
        view = model
    }

    override fun getInfo() {
        val apiInterface = ApiClient.create()

        apiInterface.getInfo()
                .enqueue(object : Callback<ResponseInfo>{

                    override fun onResponse(call: Call<ResponseInfo>?, response: Response<ResponseInfo>?) {

                        val info : ResponseInfo = response?.body()!!

                        if (response.isSuccessful){
                            view?.showInfo(info.data!!)
                        }
                    }

                    override fun onFailure(call: Call<ResponseInfo>?, t: Throwable?) {

                    }



                })
    }
}