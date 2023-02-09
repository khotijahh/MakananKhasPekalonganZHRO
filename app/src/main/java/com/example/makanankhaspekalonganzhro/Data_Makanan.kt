package com.example.makanankhaspekalonganzhro

import android.os.Parcelable
import android.widget.ImageView
import kotlinx.parcelize.Parcelize


@Parcelize
data class Data_Makanan (
    val imageView: Int,
    val textName:String,
    val textdescripsi:String,
) : Parcelable



