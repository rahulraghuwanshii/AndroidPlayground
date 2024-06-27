package com.rahulraghuwanshi.androidplayground.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rahulraghuwanshi.androidplayground.R

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAJAMA", "Activity_B >>onCreate() called")
        enableEdgeToEdge()
        setContentView(R.layout.activity_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btn).setOnClickListener{
            startActivity(Intent(this,ActivityTwo::class.java))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MAJAMA", "Activity_B >> onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MAJAMA", "Activity_B >> onRestoreInstanceState() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAJAMA", "Activity_B >> onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAJAMA", "Activity_B >> onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAJAMA", "Activity_B >> onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAJAMA", "Activity_B >> onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAJAMA", "Activity_B >> onDestroy() called")
    }
}