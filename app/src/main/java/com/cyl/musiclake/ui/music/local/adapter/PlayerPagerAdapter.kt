package com.cyl.musiclake.ui.music.local.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**

 */
class PlayerPagerAdapter(fm: FragmentActivity, private var mFragments: MutableList<Fragment>) : FragmentStateAdapter(fm) {

    fun setFragments(mFragments: MutableList<Fragment>) {
        this.mFragments = mFragments
    }

    override fun getItemCount(): Int {
        return mFragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragments[position]
    }
}
