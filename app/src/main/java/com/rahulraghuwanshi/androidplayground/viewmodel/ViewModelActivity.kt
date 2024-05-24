package com.rahulraghuwanshi.androidplayground.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rahulraghuwanshi.androidplayground.databinding.ActivityViewModelBinding
import com.rahulraghuwanshi.androidplayground.viewmodel.factory.CounterViewModelFactory


// Article to read : https://blog.mindorks.com/android-viewmodels-under-the-hood/
class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelBinding
    private lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // hashcode of the current activity instance
        binding.hashcode.text = this.hashCode().toString()
        setupViewModel()
        setUpListeners()
    }

    private fun setupViewModel() {
        counterViewModel = ViewModelProvider(this, CounterViewModelFactory())[CounterViewModel::class.java]
        counterViewModel.liveData.observe(this) {
            binding.counter.text = it.toString()
        }
    }

    private fun setUpListeners() {
        binding.btnIncrement.setOnClickListener {
            counterViewModel.increment()
        }
        binding.btnDecrement.setOnClickListener {
            counterViewModel.decrement()
        }
    }
}