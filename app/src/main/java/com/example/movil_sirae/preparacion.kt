package com.example.movil_sirae

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivityPreparacionBinding

class PreparacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreparacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPreparacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolver.setOnClickListener {
            finish()
        }

        binding.btnCompletado.setOnClickListener {
            Toast.makeText(
                this,
                "Paso de preparación completado con éxito",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}