package com.example.sook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sook.databinding.ActivitySook5Binding

class sookActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivitySook5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySook5Binding.inflate((layoutInflater))
        setContentView(binding.root)

    }
}