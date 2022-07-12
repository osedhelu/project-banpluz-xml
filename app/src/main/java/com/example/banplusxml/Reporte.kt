package com.example.banplusxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banplusxml.databinding.ActivityReporteBinding

class Reporte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityReporteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}