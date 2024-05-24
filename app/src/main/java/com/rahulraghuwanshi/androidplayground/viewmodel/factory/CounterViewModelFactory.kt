package com.rahulraghuwanshi.androidplayground.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rahulraghuwanshi.androidplayground.viewmodel.CounterViewModel

class CounterViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CounterViewModel::class.java)) {
            return CounterViewModel() as T
        }
        throw IllegalArgumentException("Unable to create viewmodel")
    }
}