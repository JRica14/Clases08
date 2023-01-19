package com.example.clases08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clases08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Elfo.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.elfo)
            binding.Aceptar.isEnabled=true
        }
        binding.Humano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.humano)
            binding.Aceptar.isEnabled=true
        }
        binding.Goblin.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.goblin)
            binding.Aceptar.isEnabled=true
        }
        binding.Enano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.enano)
            binding.Aceptar.isEnabled=true
        }
        binding.Aceptar.setOnClickListener(){
            val intent = Intent(this, PaginaBlanco::class.java)
            startActivity(intent)
        }
    }
}