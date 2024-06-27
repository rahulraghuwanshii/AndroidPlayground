package com.rahulraghuwanshi.androidplayground

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.time.Duration.Companion.seconds


suspend fun api1(): Boolean {
    delay(2.seconds)
    return true
}

suspend fun api2(): Boolean {
    delay(10.seconds)
    return true
}

suspend fun colelctionALl() = coroutineScope {
    val res1d = async {
        api1()
    }
    val res2d = async {
        api2()
    }
    val res1 =  res1d.await()
    var res2: Boolean = false
    val x = flow<Boolean> {
        emit(res2d.await())
    }
    withTimeoutOrNull(5.seconds) {
       res2 = x.first();
    }

    println("Result one : $res1")
    println("Result teo : $res2")
    println(x.first())
}

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking<Unit>{

    GlobalScope.launch {
        println("Nothing >>Thread started: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.IO) {
        println("Dispatchers.IO >> Thread started: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        println("Dispatchers.Default >> Thread started: ${Thread.currentThread().name}")
    }
}