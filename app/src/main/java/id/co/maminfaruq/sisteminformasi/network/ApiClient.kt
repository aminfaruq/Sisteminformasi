package id.co.maminfaruq.sisteminformasi.network

import id.co.maminfaruq.sisteminformasi.utils.Constans
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {

    fun create(): ApiInterface {

        val logging = HttpLoggingInterceptor()
        // set log level
        logging.level = HttpLoggingInterceptor.Level.BODY
        // membuat object httpClient
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constans.baseURL!!)
                .client(httpClient.build())
                .build()

        return retrofit.create(ApiInterface::class.java)

    }
}