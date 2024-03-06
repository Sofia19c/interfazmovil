package co.edu.javeriana.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.edu.javeriana.proyecto.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}