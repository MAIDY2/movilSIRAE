package com.example.movil_sirae

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged

import com.example.movil_sirae.databinding.*

class CATEGRIAS_SUPERV : AppCompatActivity() {

    private lateinit var binding: ActivityCategriasSupervBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategriasSupervBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.btnMenu.setOnClickListener {
            showToast("Abriendo menú lateral...")
        }

        binding.btnNuevaCategoria.setOnClickListener {
            showToast("Crear nueva categoría ➕")
        }

        binding.txtBuscar.doOnTextChanged { text, _, _, _ ->
            val query = text?.toString()?.trim().orEmpty()
            filtrarCategorias(query)
        }
    }

    private fun filtrarCategorias(query: String) {
        if (query.isNotEmpty()) {
            showToast("Buscando: $query")
        }
    }

    private fun showToast(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}