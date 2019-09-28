package com.example.daftarmenu.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daftarmenu.R
import com.example.daftarmenu.data.MenuModel
import kotlinx.android.synthetic.main.makanan_fragment.*

class FragmentMakanan : Fragment() {
    companion object {
        fun getInstance(): FragmentMakanan {
            return FragmentMakanan()
        }
    }

    val dataMakanan= mutableListOf<MenuModel>()
    val rvAdapter=RvAdapter(dataMakanan)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.makanan_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_makanan.adapter=rvAdapter
        rv_makanan.layoutManager=
            LinearLayoutManager(context)
        addDummyData()
    }
    private fun addDummyData(){
        dataMakanan.add(
            MenuModel(
               "Mie dok-dok",
                "Rp. 8.000",
                R.drawable.mie_dokdok
            ))
        dataMakanan.add(
            MenuModel(
                "Mie dok-dok special",
            "Rp. 9.000",
            R.drawable.mie_dokdok2
            ))
        dataMakanan.add(
            MenuModel(
                "Mie dok-dok special istimewa",
            "Rp. 15.000",
            R.drawable.mie_dokdok3
            ))
    }
}