package com.example.assignment_moving_new.data.model

import com.example.assignment_moving_new.data.vos.MovieVO
import com.example.assignment_moving_new.utils.MovieConstants

object MovieModelImpl : MovieModel,BaseModel(){
    override fun getMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        if(mDatabase.areMoviesExistInDB()){
            onSuccess(mDatabase.movieDao().getAllMovies())
        }else{
            mDataAgent.getMovies(
                MovieConstants.DUMMY_ACCESS_TOKEN,
                {
//                    mDatabase.eventDao().insertEvents(it)

                        moviesFromNetwork -> mDatabase.movieDao().insertMovies(moviesFromNetwork)
                    onSuccess(moviesFromNetwork)
                },
                {
                    onFailure(it)
                }
            )
        }
    }

    override fun getMovieByid(movieId: Int): MovieVO {
        return  mDatabase.movieDao().getMovieById(movieId)
    }
}