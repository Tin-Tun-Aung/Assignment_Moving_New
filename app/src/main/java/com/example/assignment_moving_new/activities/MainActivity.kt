package com.example.assignment_moving_new.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.assignment_moving_new.R
import com.example.assignment_moving_new.delegates.MovieItemDelegate
import com.example.assignment_moving_new.fragments.ViewPagerFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        var fragment : Fragment = ViewPagerFragment()

        var manager : FragmentManager=supportFragmentManager
        var transaction : FragmentTransaction=manager.beginTransaction()
        transaction.replace(R.id.rl,fragment)
        transaction.commit()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }


}
