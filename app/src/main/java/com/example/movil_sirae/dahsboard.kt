package com.example.movil_sirae

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivityDahsboardBinding

class dahsboard : AppCompatActivity() {

    private lateinit var binding: ActivityDahsboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDahsboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correoUsuario = intent.getStringExtra("USER_EMAIL")
        binding.txtNombreUsuario.text = correoUsuario ?: "Camilo Muñoz"

        cargarDatosDashboard()
    }

    private fun cargarDatosDashboard() {
        binding.txtRol.text = "Supervisor PAE - Valle del Cauca"
        binding.txtDiasEntrega.text = "Faltan 8 días"
        binding.txtTotalProductos.text = "128"
        binding.txtDisponibles.text = "96"
        binding.txtCriticos.text = "20"
    }
}