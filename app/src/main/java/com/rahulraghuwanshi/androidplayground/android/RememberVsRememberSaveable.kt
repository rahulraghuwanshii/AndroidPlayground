package com.rahulraghuwanshi.androidplayground.android

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

@Composable
fun CounterButtonWithoutRemember() {
    val count = mutableStateOf(0)

    Text("Counter : ${count.value}")

    Button(onClick = { count.value++ }) {
        Text("Click Me")
    }
}