package com.example.sook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sook.databinding.ActivitySook2Binding
import kotlin.math.log

class sookActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivitySook2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySook2Binding.inflate((layoutInflater))
        setContentView(binding.root)


        binding.Btn1.setOnClickListener {

            val myintent = Intent(this, sookActivity3::class.java)
            startActivity(myintent)

        }
        binding.rectangle21.setOnClickListener {

            val myintent = Intent(this, MainActivity::class.java)
            startActivity(myintent)

        }
        binding.rectangle23.setOnClickListener {

            val myintent = Intent(this, sookActivity3::class.java)
            startActivity(myintent)

        }


    }
}