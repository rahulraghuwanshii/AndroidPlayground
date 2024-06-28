package com.rahulraghuwanshi.androidplayground.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


// runBlocking executes code in sequential manner.
fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast: ${System.currentTimeMillis()}")
            com.rahulraghuwanshi.androidplayground.coroutine.concurrent.printForecast()
            com.rahulraghuwanshi.androidplayground.coroutine.concurrent.printTemperature()
        }
    }
    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun printForecast() {// this function will take 1 seconds to execute.
    delay(1000)
    println("Sunny : ${System.currentTimeMillis()}")
}

suspend fun printTemperature() { // this function will take 2 seconds to execute.
    delay(2000)
    println("30\u00b0C : ${System.currentTimeMillis()}")
}