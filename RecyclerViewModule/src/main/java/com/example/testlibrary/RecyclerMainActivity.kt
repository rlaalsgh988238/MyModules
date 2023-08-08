package com.example.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlibrary.databinding.RecyclerActivityMainBinding

class RecyclerMainActivity : AppCompatActivity() {
    private lateinit var binding: RecyclerActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecyclerActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}