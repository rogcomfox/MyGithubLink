package com.nusantarian.mygithublink.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {

    companion object{
        const val BASE_URL = "https://api.github.com"
        var retrofit: Retrofit? = null
    }

    fun getClient(): Retrofit? {
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}