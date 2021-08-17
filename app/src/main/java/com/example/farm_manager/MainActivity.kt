package com.example.farm_manager

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener


class MainActivity : AppCompatActivity(), OnTabSelectedListener {
    private var viewPager: ViewPager? = null
    private val tabLayout: TabLayout? = null
    private var btnSub: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSub = findViewById<View>(R.id.btn_Submit) as Button
        btnSub!!.setOnClickListener { validate1() }

        //Adding toolbar to the activity
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)


        //Initializing the tabLayout
        val tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout


        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("FARMERS"))
        tabLayout.addTab(tabLayout.newTab().setText("NEW FARMER"))
        tabLayout.addTab(tabLayout.newTab().setText("DETAILS"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL


        //Initializing viewPager
        viewPager = findViewById<View>(R.id.pager) as ViewPager

        //Creating our pager adapter
        val adapter = Pager(supportFragmentManager, tabLayout.tabCount)
        // Adding adapter to pager
        viewPager!!.adapter = adapter
        viewPager!!.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))

        //adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this)
    }

    private fun validate1() {}
    override fun onTabSelected(tab: TabLayout.Tab) {
        viewPager!!.currentItem = tab.position
    }

    override fun onTabUnselected(tab: TabLayout.Tab) {}
    override fun onTabReselected(tab: TabLayout.Tab) {}
}