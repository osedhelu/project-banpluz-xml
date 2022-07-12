package com.example.banplusxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banplusxml.databinding.ActivityVueltoBinding

class Vuelto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityVueltoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}