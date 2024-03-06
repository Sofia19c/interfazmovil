package co.edu.javeriana.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.javeriana.proyecto.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.ingresaporfa.setOnClickListener {
            Log.i("Hola", "Presioné el boton")
            val intento1 = Intent(this, MrfActivity::class.java)
            startActivity(intento1)

        }
    }
}