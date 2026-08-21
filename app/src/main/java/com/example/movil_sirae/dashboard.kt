package com.example.movil_sirae

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // =====================================
        // BOTÓN DE CALENDARIO
        // =====================================

        val imgCalendario = findViewById<ImageView>(
            R.id.imgCalendario
        )

        imgCalendario.setOnClickListener {

            val intent = Intent(
                this, CalendarioActivity::class.java
            )

            startActivity(intent)
        }
    }
}