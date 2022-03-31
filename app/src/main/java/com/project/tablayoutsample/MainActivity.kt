package com.project.tablayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val tabTitle = listOf("page 1", "page 2", "page 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager2>(R.id.viewPager2)
        val tl = findViewById<TabLayout>(R.id.tabLayout)
        pager.adapter = MyAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tl, pager) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}