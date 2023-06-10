package com.example.a10120781utsguruh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainGallery : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var gambarList: ArrayList<Gambar>
    private lateinit var gambarAdapter: GambarAdapter

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_gallery)

        init()

    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this , 2)

        gambarList = ArrayList()
        addDataToList()

        gambarAdapter = GambarAdapter(gambarList)
        recyclerView.adapter = gambarAdapter
    }

    private fun addDataToList(){
        gambarList.add(Gambar(R.drawable.maleelement))
        gambarList.add(Gambar(R.drawable.maleelement2))
        gambarList.add(Gambar(R.drawable.maleelement))
        gambarList.add(Gambar(R.drawable.maleelement2))
        gambarList.add(Gambar(R.drawable.maleelement))
        gambarList.add(Gambar(R.drawable.maleelement2))
        gambarList.add(Gambar(R.drawable.maleelement))
    }

}

//Nama : Guruh Fillah Alfariza
//NIM  : 10120781
//KELAS : IF-9
//Tanggal Pengerjaan : 14 MEI 2023