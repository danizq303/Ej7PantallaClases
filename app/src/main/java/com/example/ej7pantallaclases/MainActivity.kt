package com.example.ej7pantallaclases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej7pantallaclases.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
        }

        binding.button2.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
        }

        binding.button3.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.berserker)
        }

        binding.button4.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.ladron)
        }

        binding.button5.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}