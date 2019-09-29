package com.example.assignment_moving_new.data.model

import com.example.assignment_moving_new.data.vos.MovieVO

interface MovieModel {

    fun getMovies(
        onSuccess : (List<MovieVO>) -> Unit,
        onFailure : (String) -> Unit
    )

    fun getMovieByid(eventId : Int) : MovieVO
}