package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityRecyclerMainBinding

class RecyclerMainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRecyclerMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRecyclerMainBinding.inflate(layoutInflater)
        val view = mBinding.root

        setContentView(view)
    }
}