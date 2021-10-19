package com.example.viewpager.presentation.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.presentation.feedback.FeedbackFragment
import com.example.viewpager.presentation.home.HomeFragment
import com.example.viewpager.presentation.settings.SettingsFragment

class NavigationAdapter(private val context: Context, fm: FragmentManager, private val totalTabs: Int) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = totalTabs

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return HomeFragment()
            }
            1 -> {
                return FeedbackFragment()
            }
            2 -> {
                return SettingsFragment()
            }
            else -> return HomeFragment()
        }
    }

}