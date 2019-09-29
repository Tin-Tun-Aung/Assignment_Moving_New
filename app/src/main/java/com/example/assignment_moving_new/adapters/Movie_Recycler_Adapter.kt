package com.example.assignment_moving_new.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.assignment_moving_new.R
import com.example.assignment_moving_new.data.vos.MovieVO
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import com.example.assignment_moving_new.view.holders.MovieItemViewHolder

class Movie_Recycler_Adapter(val delegate : MovieItemDelegate): BaseAdapter<MovieItemViewHolder, MovieVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MovieItemViewHolder(view,delegate)
    }
}