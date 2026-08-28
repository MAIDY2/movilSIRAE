package com.example.movil_sirae

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivityPerfilSupervisorBinding

class activity_perfil_supervisor : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilSupervisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar layout con ViewBinding
        binding = ActivityPerfilSupervisorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botón Atrás
        binding.btnBack.setOnClickListener {
            finish()
        }

        // Botón Guardar Cambios
        binding.btnGuardar.setOnClickListener {
            val nombre = binding.etNombre.text.toString().trim()
            val correo = binding.etCorreo.text.toString().trim()
            val telefono = binding.etTelefono.text.toString().trim()
            val ubicacion = binding.etUbicacion.text.toString().trim()

            if (nombre.isEmpty() || correo.isEmpty()) {
                Toast.makeText(this, "Por favor completa los campos obligatorios", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Perfil actualizado correctamente", Toast.LENGTH_SHORT).show()
        }
    }
}