package com.example.assignment_moving_new.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_moving_new.R
import com.example.assignment_moving_new.adapters.Movie_Recycler_Adapter
import com.example.assignment_moving_new.data.model.MovieModel
import com.example.assignment_moving_new.data.model.MovieModelImpl
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_now_showing.*
import kotlinx.android.synthetic.main.fragment_now_showing.view.*

class NowShowingFragment() : Fragment(),MovieItemDelegate {
    override fun onTapMovieItem(movieId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize model
        var model : MovieModel=MovieModelImpl


        // Inflate the layout for this fragment
        var view : View= inflater.inflate(R.layout.fragment_now_showing, container, false)

        val movieListAdapter = Movie_Recycler_Adapter(this)

        view.rv_list.adapter=movieListAdapter

        var manager : RecyclerView.LayoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        view.rv_list.layoutManager=manager

        model.getMovies(
            {
                movies -> movieListAdapter.setNewData(movies.toMutableList())
            }
        ,
            {
                Toast.makeText(context,it,Toast.LENGTH_LONG).show()
            }
        )


        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()
    }


}
