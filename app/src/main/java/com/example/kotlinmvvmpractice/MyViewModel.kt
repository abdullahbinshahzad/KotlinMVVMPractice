package com.example.kotlinmvvmpractice

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private var counter = 0

    fun readCounter(): Int{
        return counter
    }

    fun updateCounter(): Int{
        return ++counter
    }
}