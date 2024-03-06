package co.edu.javeriana.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter (
    val menus: List<MenuClass>
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    class MenuViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageMe : ImageView
        val titleMe : TextView
        val botonMe : TextView
        init{
            imageMe = view.findViewById(R.id.imgMenu)
            titleMe = view.findViewById(R.id.TituloMenu)
            botonMe = view.findViewById(R.id.BotonMenu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val currentitem = menus[position]
        holder.imageMe.setImageResource(currentitem.imgMenu)
        holder.titleMe.text = currentitem.MenuTitle
        holder.botonMe.text = currentitem.BotonMenu

    }

    override fun getItemCount(): Int {
        return menus.size
    }
}