package co.edu.javeriana.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import co.edu.javeriana.proyecto.databinding.ActivityComidasBinding


class ComidasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComidasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val comidaList = listOf(
            MenuClass(R.drawable.hamburguesa, "Hamburguesas","Ver"),
            MenuClass(R.drawable.pizzamediana, "Pizzas","Ver"),
            MenuClass(R.drawable.salchipapa2, "Salchipapas","Ver")
        )

        val adapter4 = MenuAdapter(comidaList)
        binding.rvcomidas.adapter = adapter4
        binding.rvcomidas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val cercanoList = listOf(
            CercanosClass("La Hamburguesería","Restaurante de Comidas Rápidas con una gran variedad de opciones, entre papas, entradas, y diversas hamburguesas para todos los gustos", R.drawable.lahamburgueseria, "Ver Menú", "Ver Ruta"),
            CercanosClass("La Salchipapería","Restaurande de Comidas Rápidas cuya especialidad se centra en las presentaciones con salchipapa. Las diversas presentaciones de este plato fascinarán tu paladar", R.drawable.lasalchipaperia, "Ver Menú", "Ver Ruta"),
            CercanosClass("Sushi Food","Restuarante de Comida Oriental cuya oferta principal son los sushis, una comida a base de pescado, cocinada y enplatada de un modo único", R.drawable.restaurantesushi, "Ver Menú", "Ver Ruta")
        )

        val adapter5 = CercanosAdapter(cercanoList)
        binding.rvcercanos.adapter = adapter5
        binding.rvcercanos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
}