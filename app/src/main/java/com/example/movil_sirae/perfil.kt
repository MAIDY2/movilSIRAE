package com.example.movil_sirae

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivityPerfilBinding

class PerfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener {
        finish()
    }

        binding.optionEditarPerfil.setOnClickListener {
        Toast.makeText(this, "Editar datos personales", Toast.LENGTH_SHORT).show()

        }

    binding.optionCambiarClave.setOnClickListener {
        Toast.makeText(this, "Cambiar contraseña", Toast.LENGTH_SHORT).show()

    }


        binding.optionCarne.setOnClickListener {
        Toast.makeText(this, "Carné de manipulación", Toast.LENGTH_SHORT).show()
        }
    }
}