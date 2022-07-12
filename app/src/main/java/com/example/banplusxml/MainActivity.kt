package com.example.banplusxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banplusxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnReporte.setOnClickListener {
            val intent = Intent(this, Reporte::class.java)
            startActivity(intent)
        }
        binding.btnVuelto.setOnClickListener {
            val intent = Intent(this, Vuelto::class.java)
            startActivity(intent)
        }
    }
}