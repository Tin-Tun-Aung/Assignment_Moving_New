package com.example.assignment_moving_new.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.assignment_moving_new.R
import com.example.assignment_moving_new.adapters.ViewPagerAdapter
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import kotlinx.android.synthetic.main.fragment_view_pager.*
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment() : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view : View = inflater.inflate(R.layout.fragment_view_pager, container, false)

        var manager: FragmentManager? =childFragmentManager

        if(manager !=null){
            var adapter = ViewPagerAdapter(manager)
            view.viewPager_vg.adapter=adapter
            view.tabLayout_vg.setupWithViewPager(viewPager_vg)
        }


        return view
    }

    // TODO: Rename method, update argument and hook method into UI event

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

}
