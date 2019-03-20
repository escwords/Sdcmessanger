package com.example.sdcproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MainpagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

 private val listFragment:MutableList<Fragment> = ArrayList()
    private val listTitle:MutableList<String> = ArrayList()


    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    override fun getCount(): Int {
        return listTitle.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listTitle[position]
    }

    fun addFragment(fragment: Fragment, title:String){
        listFragment.add(fragment)
        listTitle.add(title)

    }

}