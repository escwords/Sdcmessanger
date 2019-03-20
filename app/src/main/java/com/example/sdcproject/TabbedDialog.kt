package com.example.sdcproject

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.viewpager.widget.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.pager_signing.*

class TabbedDialog : DialogFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.pager_signing,container,false)

        val pager = rootView.findViewById<ViewPager>(R.id.pager_sign)
        val tab = rootView.findViewById<TabLayout>(R.id.tabb)
        val adapter = MainpagerAdapter(childFragmentManager)
        adapter.addFragment(login(),"Login")
        adapter.addFragment(register(),"Register")
        pager.adapter = adapter
        tab.setupWithViewPager(pager)
        return rootView
    }
}