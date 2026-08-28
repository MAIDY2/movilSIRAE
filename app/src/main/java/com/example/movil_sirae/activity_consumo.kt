package com.example.movil_sirae

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity_consumo : AppCompatActivity() {

    private lateinit var btnBack: ImageView
    private lateinit var tvConsumoHoy: TextView
    private lateinit var tvBajoStock: TextView
    private lateinit var tvCriticos: TextView
    private lateinit var tvProximaEntrega: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo)

        initViews()
        setupListeners()
        loadDashboardData()
    }
    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        tvConsumoHoy = findViewById(R.id.tvConsumoHoy)
        tvBajoStock = findViewById(R.id.tvBajoStock)
        tvCriticos = findViewById(R.id.tvCriticos)
        tvProximaEntrega = findViewById(R.id.tvProximaEntrega)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun loadDashboardData() {
        tvConsumoHoy.text = "54 Kg"
        tvBajoStock.text = "5"
        tvCriticos.text = "12"
        tvProximaEntrega.text = "2 días"
    }
}