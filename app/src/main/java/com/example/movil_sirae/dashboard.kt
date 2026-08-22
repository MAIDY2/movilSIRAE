package com.example.movil_sirae

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class dashboard : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

        val imgCalendario = findViewById<ImageView>(R.id.imgCalendario)

        imgCalendario.setOnClickListener {
            startActivity(
                Intent(this, CalendarioActivity::class.java)
            )
        }
    }
}