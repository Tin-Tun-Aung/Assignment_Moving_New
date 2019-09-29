package com.example.assignment_moving_new.data.model

import android.content.Context
import com.example.assignment_moving_new.network.dataagents.RetrofitDataAgentImpl
import com.example.assignment_moving_new.persistence.MovieDatabase

abstract class BaseModel {

    protected val mDataAgent = RetrofitDataAgentImpl

    protected lateinit var mDatabase : MovieDatabase

    fun initDatabase(context : Context){
        mDatabase= MovieDatabase.getInstance(context)
    }
}