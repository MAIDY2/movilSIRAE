package com.example.movil_sirae

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movil_sirae.databinding.ActivityLoginSupervisorBinding

class loginSUPERVISOR : AppCompatActivity() {

    private lateinit var binding: ActivityLoginSupervisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginSupervisorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAcceder.setOnClickListener {
            Toast.makeText(this, "Accediendo al Dashboard...", Toast.LENGTH_SHORT).show()
        }
    }
}