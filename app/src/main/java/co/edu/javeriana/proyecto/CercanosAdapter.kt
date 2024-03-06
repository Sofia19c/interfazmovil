package co.edu.javeriana.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CercanosAdapter (
    val cercanos : List<CercanosClass>
) : RecyclerView.Adapter<CercanosAdapter.CercanosViewHolder>() {
    class CercanosViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val titleCe : TextView
        val descriptionCe : TextView
        val imageCe : ImageView
        val botonunoCe: TextView
        val botondosCe: TextView
        init {
            titleCe = view.findViewById(R.id.TituloCercanoUno)
            descriptionCe = view.findViewById(R.id.DescripcionCercanoUno)
            imageCe = view.findViewById(R.id.ImgCercano)
            botonunoCe = view.findViewById(R.id.BotonCercanoUno)
            botondosCe = view.findViewById(R.id.BotonCercanoDos)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CercanosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cercanos,parent,false)
        return CercanosViewHolder(view)
    }

    override fun onBindViewHolder(holder: CercanosViewHolder, position: Int) {
        val currentitem = cercanos[position]
        holder.titleCe.text = currentitem.titleCercano
        holder.descriptionCe.text =currentitem.descriptionCercano
        holder.imageCe.setImageResource(currentitem.imgCercano)
        holder.botonunoCe.text = currentitem.botonUnoCercano
        holder.botondosCe.text = currentitem.botonDosCercano
    }

    override fun getItemCount(): Int {
        return cercanos.size
    }
}