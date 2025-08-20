package com.luckyfriday.instagramclone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.luckyfriday.instagramclone.fragments.HomeFragment
import com.luckyfriday.instagramclone.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragmentContainer(HomeFragment.newInstance())
        findViewById<BottomNavigationView>(R.id.nav_view)?.apply {
            itemIconTintList = null
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_home -> {
                        setFragmentContainer(HomeFragment.newInstance())
                        true
                    }

                    R.id.navigation_explore -> true
                    R.id.navigation_post -> true
                    R.id.navigation_reels -> true
                    R.id.navigation_profile -> {
                        setFragmentContainer(ProfileFragment.newInstance())
                        true
                    }

                    else -> false
                }
            }
        }
    }

    private fun setFragmentContainer(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}