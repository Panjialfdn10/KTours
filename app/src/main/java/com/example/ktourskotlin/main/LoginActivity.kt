package com.example.ktourskotlin.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktourskotlin.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}