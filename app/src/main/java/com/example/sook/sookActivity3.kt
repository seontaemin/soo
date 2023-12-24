package com.example.sook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sook.databinding.ActivitySook3Binding
import kotlin.math.log

class sookActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivitySook3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySook3Binding.inflate((layoutInflater))
        setContentView(binding.root)


        binding.Btn2.setOnClickListener {
            val myIntent = Intent(this, sookActivity4::class.java)
            startActivity(myIntent)
        }

        binding.rectangle31.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

        binding.rectangle32.setOnClickListener {
            val myIntent = Intent(this, sookActivity2::class.java)
            startActivity(myIntent)
        }

    }
}