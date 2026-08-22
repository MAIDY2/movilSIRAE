        package com.example.loginn

        import android.os.Bundle
        import android.widget.Toast
        import androidx.appcompat.app.AppCompatActivity
        import com.example.movil_sirae.databinding.ActivityLoginBinding

        class LoginActivity : AppCompatActivity() {

        private lateinit var binding: ActivityLoginBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener {

            val correo = binding.txtCorreo.text.toString().trim()
            val contrasena = binding.txtContrasena.text.toString().trim()

            binding.layoutCorreo.error = null
            binding.layoutContrasena.error = null

            var esValido = true

            if (correo.isEmpty()) {
                binding.layoutCorreo.error = "Ingrese su correo"
                esValido = false
            }

            if (contrasena.isEmpty()) {
                binding.layoutContrasena.error = "Ingrese su contraseña"
                esValido = false
            }

            if (esValido) {
                Toast.makeText(
                    this,
                    "Datos ingresados correctamente",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.txtOlvide.setOnClickListener {
            Toast.makeText(
                this,
                "Recuperar contraseña",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.txtRegistro.setOnClickListener {
            Toast.makeText(
                this,
                "Registro de usuario",
                Toast.LENGTH_SHORT
            ).show()
           }
          }
        }