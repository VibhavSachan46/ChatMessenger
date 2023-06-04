package com.vibhav.chatmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.vibhav.chatmessenger.Adapter.ViewPagerAdapter
import com.vibhav.chatmessenger.Fragments.CallFragment
import com.vibhav.chatmessenger.Fragments.ChatFragment
import com.vibhav.chatmessenger.Fragments.StatusFragment
import com.vibhav.chatmessenger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val fragmentArrayList = ArrayList<Fragment>()

        fragmentArrayList.add(ChatFragment())
        fragmentArrayList.add(StatusFragment())
        fragmentArrayList.add(CallFragment())

        val adapter = ViewPagerAdapter(this, supportFragmentManager, fragmentArrayList)

        binding!!.viewPager.adapter = adapter

        binding!!.tabs.setupWithViewPager(binding!!.viewPager)
    }
}