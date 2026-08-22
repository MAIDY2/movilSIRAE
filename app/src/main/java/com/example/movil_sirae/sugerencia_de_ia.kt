package com.example.movil_sirae

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivitySugerenciaDeIaBinding

class sugerencia_de_ia : AppCompatActivity() {

    private lateinit var binding: ActivitySugerenciaDeIaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySugerenciaDeIaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerMas.setOnClickListener {
            val intent = Intent(this, seleccionar_menu ::class.java)
            startActivity(intent)
        }
    }
}