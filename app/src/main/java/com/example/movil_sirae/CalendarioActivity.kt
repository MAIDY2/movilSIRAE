package com.example.movil_sirae

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CalendarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Carga la pantalla del calendario
        setContentView(R.layout.calendario)

        // Botón volver
        val btnAtras = findViewById<ImageView>(R.id.btnAtras)

        btnAtras.setOnClickListener {
            finish()
        }
    }
}