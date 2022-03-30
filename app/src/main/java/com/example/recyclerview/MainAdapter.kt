package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPerfilBinding
import org.json.JSONObject


class MainAdapter(private val perfiles: kotlin.Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemPerfilBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(perfiles[position])
    }

    override fun getItemCount(): Int= perfiles.size


    class MainHolder(val binding: ItemPerfilBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(perfil: JSONObject) {
            binding.Nombre.setText(perfil.getString("nom"))
            binding.Descripcion.setText(perfil.getString("desc"))
            binding.Likes.setText(perfil.getString("likes"))
            binding.btnLike.setText(perfil.getString("like"))
            binding.btnPrevia.setText(perfil.getString("prev"))
            binding.Imagen.setImageResource(R.drawable.nombre_paceholder)
            binding.Avatar.setImageResource(R.drawable.avatar_placeholder)

        }
    }
}