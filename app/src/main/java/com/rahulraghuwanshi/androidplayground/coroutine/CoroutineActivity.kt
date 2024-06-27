package com.rahulraghuwanshi.androidplayground.coroutine

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rahulraghuwanshi.androidplayground.databinding.ActivityCoroutineBinding
import com.rahulraghuwanshi.androidplayground.databinding.ActivityMainBinding

class CoroutineActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroutineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}