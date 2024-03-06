package co.edu.javeriana.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResenaAdapter (
    val resenas : List<ResenaClass>
) : RecyclerView.Adapter<ResenaAdapter.ResenaViewHolder>() {

    class ResenaViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val titleRe: TextView
        val contentRe: TextView
        val imageRe: ImageView
        init{
            titleRe = view.findViewById(R.id.TituloResenaUno)
            contentRe = view.findViewById(R.id.ResenaUno)
            imageRe = view.findViewById(R.id.ImgResena)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResenaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_resena,parent,false)
        return ResenaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResenaViewHolder, position: Int) {
        val currentItem = resenas[position]
        holder.titleRe.text = currentItem.titleResena
        holder.contentRe.text = currentItem.ResenaContent
        holder.imageRe.setImageResource(currentItem.imageResena)

    }

    override fun getItemCount(): Int {
        return resenas.size
    }
}