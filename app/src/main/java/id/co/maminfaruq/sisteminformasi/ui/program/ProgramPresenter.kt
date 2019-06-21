package id.co.maminfaruq.sisteminformasi.ui.program

import id.co.maminfaruq.sisteminformasi.model.program.ResponseProgram
import id.co.maminfaruq.sisteminformasi.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProgramPresenter(model : ProgramContract.View) : ProgramContract.Presenter {

    var view : ProgramContract.View? = null

    init {
        view = model
    }

    override fun getProgram() {

        val apiInterface = ApiClient.create()

        apiInterface.getProgram()
                .enqueue(object  : Callback<ResponseProgram>{
                    override fun onResponse(call: Call<ResponseProgram>?, response: Response<ResponseProgram>?) {

                        val program : ResponseProgram = response?.body()!!

                        if (response.isSuccessful){
                            view?.showProgram(program.data!!)
                        }

                    }

                    override fun onFailure(call: Call<ResponseProgram>?, t: Throwable?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
    }
}