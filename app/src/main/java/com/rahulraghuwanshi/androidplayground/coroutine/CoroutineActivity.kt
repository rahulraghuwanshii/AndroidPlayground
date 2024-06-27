package com.rahulraghuwanshi.androidplayground.coroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.rahulraghuwanshi.androidplayground.databinding.ActivityCoroutineBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroutineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch(Dispatchers.IO) {
            coroutine()
        }

    }

    private suspend fun coroutine(): Unit?{
        return null
    }
}