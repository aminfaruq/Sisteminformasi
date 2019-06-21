package id.co.maminfaruq.sisteminformasi.ui.profile

import id.co.maminfaruq.sisteminformasi.model.profil.ResponseProfile
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import id.co.maminfaruq.sisteminformasi.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfilePresenter(model : ProfileContract.View) : ProfileContract.Presenter {

    var view : ProfileContract.View? = null

    init {
        view = model
    }

    override fun getProfile() {

        val apiInterface = ApiClient.create()
        apiInterface.getProfil()
                .enqueue(object : Callback<ResponseProfile>{
                    override fun onResponse(call: Call<ResponseProfile>?, response: Response<ResponseProfile>?) {
                        val profile : ResponseProfile = response?.body()!!

                        if (response.isSuccessful){
                            view?.showProfile(profile.data!!)
                        }
                    }

                    override fun onFailure(call: Call<ResponseProfile>?, t: Throwable?) {

                    }
                })

    }
}