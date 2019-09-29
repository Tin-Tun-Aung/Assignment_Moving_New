package com.example.assignment_moving_new.network.responses

import com.example.assignment_moving_new.data.vos.MovieVO
import com.example.assignment_moving_new.utils.MovieConstants
import com.google.gson.annotations.SerializedName

data class GetMovieResponse(
    @SerializedName("code")
    val code: Int,

    @SerializedName("message")
    val message : String,

    @SerializedName("data")
    val data : List<MovieVO>?
    ) {
    fun isResponseOk() : Boolean{
        return code == MovieConstants.CODE_RESPONSE && data !=null
    }
}