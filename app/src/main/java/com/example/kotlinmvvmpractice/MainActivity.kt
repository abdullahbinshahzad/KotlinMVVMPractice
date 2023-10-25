package com.example.kotlinmvvmpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvmpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.TextViewCounter.text = myViewModel.readCounter().toString()

        binding.ButtonCounter.setOnClickListener {
            binding.TextViewCounter.text = myViewModel.updateCounter().toString()
        }
    }
}