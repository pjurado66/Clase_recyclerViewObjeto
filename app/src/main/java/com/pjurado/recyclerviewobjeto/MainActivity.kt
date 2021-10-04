package com.pjurado.recyclerviewobjeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pjurado.recyclerviewobjeto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   var directorio: ArrayList<Contacto> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        creaDatos()

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = ContactosAdapter(directorio)
        binding.recyclerView.adapter = adapter
    }

    private fun creaDatos() {
        directorio.add(Contacto("Pedro Jurado", "987123456", "pjurado@gmail.com", R.drawable.persona))
        directorio.add(Contacto("Pepe Pérez", "987121256", "ppe@gmail.com", 0))
        directorio.add(Contacto("Antonio Gómex", "934643456", "aoox@gmail.com", 0))
    }
}