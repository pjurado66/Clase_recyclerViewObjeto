package com.pjurado.recyclerviewobjeto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pjurado.recyclerviewobjeto.databinding.ItemContactoBinding
import com.pjurado.recyclerviewobjeto.Contacto

class ContactosAdapter(val directorio: ArrayList<Contacto>)
    : RecyclerView.Adapter<ContactosAdapter.ContactoViewHolder>() {

    class ContactoViewHolder(val binding: ItemContactoBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoViewHolder {
        val binding = ItemContactoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
        val contacto: Contacto = directorio[position]
        holder.binding.tvNombre.text = contacto.nombre
        holder.binding.tvEmail.text = contacto.email
        holder.binding.tvTelefono.text = contacto.telefono
        holder.binding.imageView.setImageResource(contacto.foto)

    }

    override fun getItemCount(): Int {
        return directorio.size
    }

}
