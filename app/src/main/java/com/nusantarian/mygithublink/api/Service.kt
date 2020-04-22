package com.nusantarian.mygithublink.api

import com.nusantarian.mygithublink.data.ItemResponse
import retrofit2.Call
import retrofit2.http.GET

interface Service {
    //get all user which the location from Indonesia
    @GET("/search/users?q=location:Indonesia")
    fun getItems(): Call<ItemResponse>?
}