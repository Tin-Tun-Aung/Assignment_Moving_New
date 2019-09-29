package com.example.assignment_moving_new.network.dataagents

import com.example.assignment_moving_new.data.vos.MovieVO

interface MovieDataAgent {

    fun getMovies(
        accessToken : String,
        onSuccess : (List<MovieVO>) -> Unit,
        onFailure:(String) -> Unit
    )
}
