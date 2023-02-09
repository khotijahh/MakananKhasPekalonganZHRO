package com.example.makanankhaspekalonganzhro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail_makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Data_Makanan = intent.getParcelableExtra<Data_Makanan>(MainActivity.INTENT_PARCELABLE)

        val imageView = findViewById<ImageView>(R.id.gambar2)
        val textName = findViewById<TextView>(R.id.textJudul)
        val textdescripsi = findViewById<TextView>(R.id.textdesc)

        imageView.setImageResource(Data_Makanan?.imageView!!)
        textName.text =Data_Makanan.textName
        textdescripsi.text =Data_Makanan.textdescripsi


        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}