package com.example.assignment_moving_new.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.assignment_moving_new.data.vos.MovieVO
import com.example.assignment_moving_new.persistence.daos.MovieDao
import com.example.assignment_moving_new.persistence.typeconverters.GenreListTypeConverter
import com.example.assignment_moving_new.utils.MovieConstants.Companion.MOVIE_DB

@Database(entities = [MovieVO::class],version = 1,exportSchema = false)
@TypeConverters(GenreListTypeConverter::class)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao() : MovieDao

    companion object{
        private var instance : MovieDatabase?=null


        fun getInstance(context: Context):MovieDatabase{
            if(instance==null){
                instance= Room.databaseBuilder(context,MovieDatabase::class.java, MOVIE_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
//            val db= instance!!
            return instance as MovieDatabase
//            return db
        }


    }

    fun areMoviesExistInDB(): Boolean{
        return movieDao().getAllMovies().isNotEmpty()
    }
}