package com.rahulraghuwanshi.androidplayground.lifecycle_aware.old_method

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rahulraghuwanshi.androidplayground.databinding.ActivityLifecycleAwareBinding

class LifecycleAwareActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLifecycleAwareBinding

    private lateinit var lifecycleListener: LifecycleListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycleAwareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupLifecycleListener()
        lifecycleListener.enable()
    }

    private fun setupLifecycleListener() {
        lifecycleListener = LifecycleListener(lifecycle) { location ->
            Log.d("MAJAMA", "LifecycleAwareActivity >> Current state is $location")
        }
    }

}