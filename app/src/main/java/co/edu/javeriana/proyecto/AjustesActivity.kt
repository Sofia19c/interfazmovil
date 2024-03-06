package com.example.talleruno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.talleruno.databinding.ActivityAjustesBinding
import com.example.talleruno.databinding.ActivityMainBinding

class AjustesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAjustesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAjustesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.editaperfil.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, EditarPerfilActivity::class.java)
            startActivity(intento1)
        }
    }
}