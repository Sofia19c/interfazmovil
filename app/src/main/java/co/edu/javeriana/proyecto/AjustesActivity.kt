package co.edu.javeriana.proyecto

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import co.edu.javeriana.proyecto.databinding.ActivityAjustesBinding

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