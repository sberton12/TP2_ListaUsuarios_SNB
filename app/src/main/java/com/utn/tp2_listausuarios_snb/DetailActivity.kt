package com.utn.tp2_listausuarios_snb

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val email: TextView=findViewById(R.id.detail_mail)
        val addres: TextView=findViewById(R.id.detail_address)
        val tel: TextView=findViewById(R.id.detail_cel)

        email.setOnClickListener {
            
        }
    }

}