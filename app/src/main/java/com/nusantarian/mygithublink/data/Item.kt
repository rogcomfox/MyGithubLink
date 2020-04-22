package com.nusantarian.mygithublink.data

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(
    @SerializedName("login")
    @Expose
    var login: String,

    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String,

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String
) : Parcelable