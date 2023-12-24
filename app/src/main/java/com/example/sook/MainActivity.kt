package com.example.sook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sook.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)


        binding.Btn.setOnClickListener {

            val myintent = Intent(this, sookActivity2::class.java)
            startActivity(myintent)

        }
        binding.rectangle12.setOnClickListener {

            val myintent = Intent(this, sookActivity2::class.java)
            startActivity(myintent)

        }
        binding.rectangle13.setOnClickListener {

            val myintent = Intent(this, sookActivity3::class.java)
            startActivity(myintent)

        }

    }
}