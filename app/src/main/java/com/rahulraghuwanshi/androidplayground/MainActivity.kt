package com.rahulraghuwanshi.androidplayground

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rahulraghuwanshi.androidplayground.databinding.ActivityMainBinding
import com.rahulraghuwanshi.androidplayground.lifecycle.ActivityOne

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAJAMA", "MainActivity >> onCreate() called")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpListeners()
    }

    private fun setUpListeners() {
        binding.btnToOpenActivityOne.setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }
        binding.btnToOpenViewModelActivity.setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MAJAMA", "MainActivity >> onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MAJAMA", "MainActivity >> onRestoreInstanceState() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAJAMA", "MainActivity >> onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAJAMA", "MainActivity >> onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAJAMA", "MainActivity >> onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAJAMA", "MainActivity >> onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAJAMA", "MainActivity >> onDestroy() called")
    }
}