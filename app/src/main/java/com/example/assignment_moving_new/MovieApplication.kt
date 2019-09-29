package com.example.assignment_moving_new

import android.app.Application
import com.example.assignment_moving_new.data.model.MovieModelImpl

class MovieApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}