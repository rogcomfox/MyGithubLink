package com.nusantarian.mygithublink.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ItemResponse {
    @SerializedName("items")
    @Expose
    private var items: List<Item>? = null

    fun getItems(): List<Item>? = items

    fun setItems(items: List<Item>?) {
        this.items = items
    }
}