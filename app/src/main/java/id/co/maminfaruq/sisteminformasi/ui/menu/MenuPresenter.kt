package id.co.maminfaruq.sisteminformasi.ui.menu

import id.co.maminfaruq.sisteminformasi.model.info.ResponseInfo
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MenuPresenter(model: MenuContract.View) : MenuContract.Presenter {

    var view: MenuContract.View? = null


    init {
        view = model
    }

    override fun getSlide() {
        val apiInterface = ApiClient.create()

        apiInterface.getInfo()
                .enqueue(object :Callback<ResponseInfo>{

                    override fun onResponse(call: Call<ResponseInfo>?, response: Response<ResponseInfo>?) {

                        if (response?.body() != null) {
                            val home: ResponseInfo = response.body()!!

                            view?.loadData(home.data!!)

                        }

                    }

                    override fun onFailure(call: Call<ResponseInfo>?, t: Throwable?) {

                    }
                })
    }
}