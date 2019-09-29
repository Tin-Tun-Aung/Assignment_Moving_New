package com.example.assignment_moving_new.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import com.example.assignment_moving_new.fragments.NowShowingFragment


class ViewPagerAdapter(manager : FragmentManager) : FragmentStatePagerAdapter(manager) {

    override fun getCount(): Int = 3


    override fun getItem(position: Int): Fragment {
        var fragment: Fragment=NowShowingFragment()
        if(position==0){
            fragment=NowShowingFragment()
        }
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Now Showing"
            1 -> "Coming Soon"
            else -> "News"
        }
    }
}