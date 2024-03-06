package com.example.talleruno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.talleruno.databinding.ActivityIngresarUserBinding
import com.example.talleruno.databinding.ActivityLoginBinding

class IngresarUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIngresarUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIngresarUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.botoningreso.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, AjustesActivity::class.java)
            startActivity(intento1)
        }
    }
}