package com.rahulraghuwanshi.androidplayground.lifecycle_aware.old_method

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifecycleListener(
    val lifecycle: Lifecycle,
    private val callback: (String) -> Unit) : LifecycleObserver {

    private var enabled = false

    var status = ""

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        if (enabled) {
            status = CONNECTED
            callback.invoke("start")
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        if (enabled) {
            status = DISCONNECTED
        }
        callback.invoke("stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy() {
        callback.invoke("destroy")
        lifecycle.removeObserver(this)
    }

    fun enable() {
        enabled = true
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            start()
        }
    }

    companion object {
        const val CONNECTED = "Connected"
        const val DISCONNECTED = "Disconnected"
    }
}