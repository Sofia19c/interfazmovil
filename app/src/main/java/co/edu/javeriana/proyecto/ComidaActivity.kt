package co.edu.javeriana.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.javeriana.proyecto.databinding.ActivityComidaBinding
import co.edu.javeriana.proyecto.databinding.ActivityIngresarUserBinding

class ComidaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComidaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.perfilboton.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, AjustesActivity::class.java)
            startActivity(intento1)
        }
    }
}