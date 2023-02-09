package com.example.makanankhaspekalonganzhro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makananList= listOf<Data_Makanan>(
            Data_Makanan(R.drawable.ftpindangtetel,"PINDANG TETEL","kuah pindang tetel " +
                    "mirip dengan kuah rawon karena menggunakan kluwak sebagai salah satu bahannya ,Cita rasa dari" +
                    " pindang tetel ini terasa gurih dengan sedikit rasa pahit dari kluwak.Makanan khas " +
                    "Pekalongan ini biasanya disajikan dengan kerupuk dan sambal pedas "),

            Data_Makanan(R.drawable.ftgarang_asem,"GARANG ASEM"," Garang asem merupakan" +
                    " hidangan dengan bumbu rempah dan potongan daging sapi sebagai isiannya.  Garang asem banyak dijual " +
                    "di warung makan yang tersebar di dalam kota.  "),

            Data_Makanan(R.drawable.gulaiserundeng2,"GULAI SERUNDENG","terbuat dari daging sapi" +
                    " atau kambing yang dipotong kemudian dicampur dengan kelapa parut tua sangrai, dan santan.  Daging " +
                    "dimasukkan bersama bumbu dan dimasak hingga matang dan santan mengental. Kelapa sangrai dimasukkan dan diaduk" +
                    " terus hingga kuahnya mengering.  "),

            Data_Makanan(R.drawable.apem2,"APEM","terbuat dari daging sapi atau kambing yang dipotong" +
                    " kemudian dicampur dengan kelapa parut tua sangrai, dan santan.  Daging dimasukkan bersama bumbu dan dimasak " +
                    "hingga matang dan santan mengental. Kelapa sangrai dimasukkan dan diaduk terus hingga kuahnya mengering.  "),

            Data_Makanan(R.drawable.megono6,"MEGONO","merupakan makanan khas pekalongan yang terdiri dari nasi putih dan nangka muda cacah." +
                    "  Lauk dari nasi megono cukup beraneka macam, ada ayam goreng, cumi hitam, tempe goreng, rempeyek, dan masih banyak lagi" +
                    "3. Pindang tetel  Sekilas, kuah pindang tetel mirip dengan kuah rawon karena menggunakan" +
                    " kluwak sebagai salah satu bahannya. Cita rasa dari pindang tetel ini terasa gurih dengan sedikit rasa pahit dari kluwak.  Makanan khas Pekalongan ini" +
                    " biasanya disajikan dengan kerupuk dan sambal pedas.  Baca juga: Resep Nasi Megono Pekalongan, Cocok untuk Sarapan  "),

            Data_Makanan(R.drawable.serungdeng1,"AYAM SERUNDENG"," daging sapi atau kambing yang dipotong kemudian dicampur dengan kelapa parut tua sangrai, " +
                    "dan santan.  Daging dimasukkan bersama bumbu dan dimasak hingga matang" +
                    " dan santan mengental. Kelapa sangrai dimasukkan dan diaduk terus hingga kuahnya mengering.  "),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rvMakanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Makanan_adapter(this, makananList){
          val intent = Intent(this,Detail_makanan::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}