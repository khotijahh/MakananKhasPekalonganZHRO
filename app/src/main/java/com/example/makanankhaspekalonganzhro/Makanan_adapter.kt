package com.example.makanankhaspekalonganzhro

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext
import java.util.*

class Makanan_adapter(private val context: Context,
                      private val makananAdapter: List<Data_Makanan>,val listener: (Data_Makanan)-> Unit)
    :RecyclerView.Adapter<Makanan_adapter.Data_MakananViewHolder>(){


    class Data_MakananViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imageView = view.findViewById<ImageView>(R.id.gambar)
        val textName = view.findViewById<TextView>(R.id.textNama)
        val textdescripsi = view.findViewById<TextView>(R.id.textdescripsi)

        fun bindView(Data_Makanan: Data_Makanan,listener: (Data_Makanan) -> Unit){
          imageView.setImageResource(Data_Makanan.imageView)
            textName.text = Data_Makanan.textName
            textdescripsi.text = Data_Makanan.textdescripsi

                itemView.setOnClickListener{
                    listener(Data_Makanan)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Data_MakananViewHolder {
        return Data_MakananViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.activity_makanan_adapter, parent, false))
    }

    override  fun onBindViewHolder(holder: Data_MakananViewHolder, position: Int) {
        holder.bindView(makananAdapter[position],listener)
    }

    override fun getItemCount(): Int = makananAdapter.size
    }

