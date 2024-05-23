package com.rahulraghuwanshi.androidplayground

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rahulraghuwanshi.androidplayground.lifecycle.ActivityOne

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAJAMA", "MainActivity >> onCreate() called")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btn).setOnClickListener{
            startActivity(Intent(this,ActivityOne::class.java))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MAJAMA", "MainActivity >> onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MAJAMA", "MainActivity >> onRestoreInstanceState() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAJAMA", "MainActivity >> onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAJAMA", "MainActivity >> onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAJAMA", "MainActivity >> onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAJAMA", "MainActivity >> onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAJAMA", "MainActivity >> onDestroy() called")
    }
}