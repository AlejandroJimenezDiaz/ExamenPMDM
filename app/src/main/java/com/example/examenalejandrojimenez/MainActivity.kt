package com.example.examenalejandrojimenez

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var titleCardView: CardView
    private lateinit var loginCardView: CardView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponentes()
        setUpListeners()
    }

    private fun initComponentes(){
        this.emailEditText = findViewById(R.id.CampoDatosEmail)
        this.passwordEditText = findViewById(R.id.CampoDatosContraseña)
        this.loginButton = findViewById(R.id.loginButton)
        this.titleCardView = findViewById(R.id.titulo)
        this.loginCardView = findViewById(R.id.cardView)
    }

    private fun setUpListeners() {
        loginButton.setOnClickListener {
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Iniciar la nueva actividad de bienvenida con el email
                val intent = Intent(this, ResultadoMainActivity2::class.java)
                intent.putExtra("email", email)
                intent.putExtra("password",password)
                startActivity(intent)
            }
        }

    }


    }




