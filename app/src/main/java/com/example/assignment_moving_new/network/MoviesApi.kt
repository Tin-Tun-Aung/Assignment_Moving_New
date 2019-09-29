package com.example.assignment_moving_new.network

import com.example.assignment_moving_new.network.responses.GetMovieResponse
import com.example.assignment_moving_new.utils.MovieConstants
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MoviesApi {

    @FormUrlEncoded
    @POST(MovieConstants.GET_MOVIES)
    fun getAllMovies(@Field(MovieConstants.PARAM_ACCESS_TOKEN)access_token : String) : Call<GetMovieResponse>
}