package co.edu.javeriana.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class FotoAdapter(
    var fotos: List<FotoClass>
) : RecyclerView.Adapter<FotoAdapter.FotoViewHolder>() {

    class FotoViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageTv: ImageView

        init {
            imageTv = view.findViewById(R.id.fotoUno)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_foto, parent, false)
        return FotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: FotoViewHolder, position: Int) {
        val currentItem = fotos[position]

        holder.imageTv.setImageResource(currentItem.imageSrc)
    }
    override fun getItemCount(): Int {
        return fotos.size
    }
}