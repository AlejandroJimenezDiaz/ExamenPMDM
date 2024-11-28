package com.example.examenalejandrojimenez


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class ResultadoMainActivity2 : AppCompatActivity() {
    private lateinit var continuarButton: Button
    private lateinit var emailText: TextView
    private lateinit var welcomeMessage: TextView
    private lateinit var passwordText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        welcomeMessage = findViewById(R.id.welcomeMessage)
        emailText = findViewById(R.id.emailText)
        continuarButton = findViewById(R.id.continuarButton)
        passwordText = findViewById(R.id.passwordText)

        val email = intent.getStringExtra("email") ?: "Usuario desconocido"
        emailText.text = "Correo: $email"
        val password = intent.getStringExtra("password")?: "incorrecta"
        passwordText.text = "Contraseña: $password"
        continuarButton.setOnClickListener {
            finish() // Cierra la actividad actual
        }

    }

}

