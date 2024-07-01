package com.rahulraghuwanshi.androidplayground.lifecycle_aware.old_method

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rahulraghuwanshi.androidplayground.databinding.ActivityLifecycleAwareBinding
import com.rahulraghuwanshi.androidplayground.lifecycle_aware.new_method.MyObserver

class LifecycleAwareActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLifecycleAwareBinding

    private lateinit var lifecycleListener: LifecycleListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycleAwareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupLifecycleListener()
        lifecycleListener.enable()

        lifecycle.addObserver(MyObserver())
    }

    private fun setupLifecycleListener() {
        lifecycleListener = LifecycleListener(lifecycle) { location ->
            Log.d("MAJAMA", "LifecycleAwareActivity >> Current state is $location")
        }
    }

}