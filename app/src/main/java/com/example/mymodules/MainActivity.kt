package com.example.mymodules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymodules.databinding.ActivityMainBinding
import com.example.testlibrary.RecyclerMainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.fragmentButton.setOnClickListener{
            val intent = Intent(this, RecyclerMainActivity::class.java)
            startActivity(intent)
        }


    }
}