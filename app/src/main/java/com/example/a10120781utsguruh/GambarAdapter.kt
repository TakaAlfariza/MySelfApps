package com.example.a10120781utsguruh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GambarAdapter(private val gambarList:ArrayList<Gambar>) :
    RecyclerView.Adapter<GambarAdapter.GambarViewHolder>() {

    class GambarViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GambarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item , parent , false)
        return GambarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gambarList.size
    }

    override fun onBindViewHolder(holder: GambarViewHolder, position: Int) {
        val gambar = gambarList[position]
        holder.imageView.setImageResource(gambar.image)
    }
}

//Nama : Guruh Fillah Alfariza
//NIM  : 10120781
//KELAS : IF-9
//Tanggal Pengerjaan : 14 MEI 2023