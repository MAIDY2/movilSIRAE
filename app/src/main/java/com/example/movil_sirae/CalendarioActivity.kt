package com.example.movil_sirae

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CalendarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.calendario)

        // =====================================
        // BOTÓN DEVOLVER
        // =====================================

        val btnAtras = findViewById<ImageView>(R.id.btnAtras)

        btnAtras.setOnClickListener {

            val intent = Intent(
                this,
                dashboard::class.java
            )

            startActivity(intent)

            finish()
        }
    }
}