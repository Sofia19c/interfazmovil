package co.edu.javeriana.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import co.edu.javeriana.proyecto.databinding.ActivityMrfBinding

class MrfActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMrfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMrfBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.botonajustes.setOnClickListener {
            Log.i("Hola","Presioné el boton")
            val intento1 = Intent(this, AjustesActivity::class.java)
            startActivity(intento1)
        }
        val menuList = listOf(
            MenuClass(R.drawable.salchipapa, "Salchipapa Especial","Ver"),
            MenuClass(R.drawable.limonadacoco, "Limonada de Coco","Ver"),
            MenuClass(R.drawable.pizzamediana, "Pizza Mediana","Ver")
        )

        val adapter = MenuAdapter(menuList)
        binding.rvmenus.adapter = adapter
        binding.rvmenus.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)


        val resenaList = listOf(
            ResenaClass("Por: Juan Villamil","Es maravilloso!, la atención, las decoraciones y cada detalle es bastante temático. Me encanta", R.drawable.imgresena),
            ResenaClass("Por: Juanita Ramirez","La calidad es buena, pero, la verdad, es bastante caro para lo que ofrecen", R.drawable.imgresena2),
            ResenaClass("Por: Camilo Vallejo","Es un ambiente interesante y agradable, pero el tiempo de preparación es bastante alto, y la atención no es tan buena", R.drawable.imgresena)
        )

        val adapter2 = ResenaAdapter(resenaList)
        binding.rvresenas.adapter = adapter2
        binding.rvresenas.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        var fotoList = listOf(
            FotoClass(R.drawable.foto),
            FotoClass(R.drawable.foto2),
            FotoClass(R.drawable.foto),
        )

        val adapter3 = FotoAdapter(fotoList)
        binding.rvfotos.adapter = adapter3
        binding.rvfotos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}