package com.example.assignment_moving_new.view.holders

import android.view.View
import com.bumptech.glide.Glide
import com.example.assignment_moving_new.data.vos.MovieVO
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import kotlinx.android.synthetic.main.item_view.view.*


class MovieItemViewHolder(itemView : View,protected val delegate : MovieItemDelegate) : BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.setOnClickListener{

            data?.id?.let {id->
                delegate.onTapMovieItem(id)
            }


        }
    }
    override fun bindData(data: MovieVO) {

        itemView.tv_black_panther.text=data.movieName

        Glide.with(itemView).load(data.poster).into(itemView.iv_card)

    }
}