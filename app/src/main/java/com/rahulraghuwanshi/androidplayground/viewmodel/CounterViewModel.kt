package com.rahulraghuwanshi.androidplayground.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _liveData = MutableLiveData<Int>()

    val liveData: LiveData<Int> = _liveData

    init {
        Log.d("MAJAMA", "CounterViewModel: init")
        _liveData.value = 0
    }

    fun increment() {
        _liveData.value = _liveData.value!! + 1
    }

    fun decrement() {
        _liveData.value = _liveData.value!! - 1
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("MAJAMA", "onCleared() called of CounterViewModel")
    }
}