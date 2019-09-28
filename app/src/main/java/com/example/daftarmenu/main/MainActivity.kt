package com.example.daftarmenu.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.daftarmenu.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val pages = listOf(FragmentMakanan(), FragmentMinuman())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager_main.adapter = ViewPagerAdapter(supportFragmentManager)
        tab_main.setupWithViewPager(viewpager_main)
    }

    inner class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return  pages[position]
        }

        override fun getCount(): Int {
            return pages.size
              }

        private val pages = listOf(

            FragmentMakanan.getInstance(),
            FragmentMinuman.getInstance()
        )

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "Makanan"
                else -> "Minuman"
            }
        }
    }
}
