package com.example.movil_sirae

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.movil_sirae.databinding.ActivityMasOpcionesBinding
import android.provider.ContactsContract

class mas_opciones : AppCompatActivity() {

    private  lateinit var  binding: ActivityMasOpcionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMasOpcionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPerfil.setOnClickListener {
            val intent = Intent(this, perfil ::class.java)
            startActivity(intent)
        }

        binding.btnGuias.setOnClickListener {
            val intent = Intent(this, guias_protocolos ::class.java)
            startActivity(intent)
        }
        binding.btnContactos.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI)
            startActivity(intent)
        }
        binding.btnCerrarSesion.setOnClickListener {
            val intent = Intent(this, dashboard ::class.java)
            startActivity(intent)
        }
    }
}