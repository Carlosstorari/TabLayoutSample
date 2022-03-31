package com.project.tablayoutsample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return SamplePage1()
            1 -> return SamplePage2()
            2 -> return SamplePage3()
            else -> return SamplePage1()
        }
    }
}