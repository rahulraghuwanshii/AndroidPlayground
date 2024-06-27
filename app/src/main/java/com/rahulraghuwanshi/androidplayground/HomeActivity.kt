package com.rahulraghuwanshi.androidplayground

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rahulraghuwanshi.androidplayground.databinding.ActivityMainBinding
import com.rahulraghuwanshi.androidplayground.lifecycle.ActivityOne
import com.rahulraghuwanshi.androidplayground.lifecycle_aware.old_method.LifecycleAwareActivity
import com.rahulraghuwanshi.androidplayground.viewmodel.ViewModelActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAJAMA", "HomeActivity >> onCreate() called")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpListeners()
    }

    private fun setUpListeners() {
        with(binding){
            btnToOpenActivityOne.setOnClickListener {
                startActivity(Intent(this@HomeActivity, ActivityOne::class.java))
            }
            btnToOpenViewModelActivity.setOnClickListener {
                startActivity(Intent(this@HomeActivity, ViewModelActivity::class.java))
            }
            btnToOpenLifeCycleAwareActivity.setOnClickListener {
                startActivity(Intent(this@HomeActivity, LifecycleAwareActivity::class.java))
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MAJAMA", "HomeActivity >> onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MAJAMA", "HomeActivity >> onRestoreInstanceState() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAJAMA", "HomeActivity >> onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAJAMA", "HomeActivity >> onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAJAMA", "HomeActivity >> onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAJAMA", "HomeActivity >> onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAJAMA", "HomeActivity >> onDestroy() called")
    }
}