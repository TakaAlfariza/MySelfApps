package com.example.a10120781utsguruh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Gallery.newInstance] factory method to
 * create an instance of this fragment.
 */
class Gallery : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var recyclerView: RecyclerView
    private lateinit var gambarList: ArrayList<Gambar>
    private lateinit var gambarAdapter: GambarAdapter

//    private lateinit var adapter : GambarAdapter
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var ArrayList : ArrayList<Gambar>
//
//    lateinit var image : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Gallery.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Gallery().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        dataInitialized()
        val layoutManager = LinearLayoutManager(context)
//        recyclerView = view.findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.setHasFixedSize(true)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager

        gambarList = ArrayList()
        addDataToList()

        gambarAdapter = GambarAdapter(gambarList)
        recyclerView.adapter = gambarAdapter
    }

    private fun addDataToList(){
        gambarList.add(Gambar(R.drawable.ke1))
        gambarList.add(Gambar(R.drawable.ke2))
        gambarList.add(Gambar(R.drawable.ke3))
        gambarList.add(Gambar(R.drawable.ke4))
        gambarList.add(Gambar(R.drawable.ke5))
        gambarList.add(Gambar(R.drawable.ke6))
        gambarList.add(Gambar(R.drawable.ke7))
    }

//    private fun dataInitialized(){
//        ArrayList = arrayListOf<Gambar>()
//
//        image = arrayOf(
//            R.drawable.maleelement,
//            R.drawable.maleelement2,
//            R.drawable.maleelement,
//            R.drawable.maleelement2,
//            R.drawable.maleelement
//        )
//        for (i in image.indices) {
//            val image = Gambar(image[i])
//            ArrayList.add(image)
//        }
//    }
}

//Nama : Guruh Fillah Alfariza
//NIM  : 10120781
//KELAS : IF-9
//Tanggal Pengerjaan : 14 MEI 2023