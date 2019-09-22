package com.example.daftarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager_main.adapter = ViewPagerAdapter(supportFragmentManager)
        tab_main.setupWithViewPager(viewpager_main)
    }

    inner class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        private val pages = listOf(
            FragmentMinuman.getInstance(),
            FragmentMakanan.getInstance()
        )

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "Makanan"
                else -> "Minuman"
            }
        }
    }
}
