package co.edu.javeriana.proyecto
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.javeriana.proyecto.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.registrarseUsuario.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, UserActivity::class.java)
            startActivity(intento1)
        }

        binding.sesionUsuario.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, IngresarUserActivity::class.java)
            startActivity(intento1)
        }

        binding.registrarseRestaurante.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, RestaurantActivity::class.java)
            startActivity(intento1)
        }
        binding.sesionRestaurante.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, IngresarRestaurantActivity::class.java)
            startActivity(intento1)
        }
    }
}