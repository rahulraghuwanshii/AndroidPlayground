package com.rahulraghuwanshi.androidplayground.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rahulraghuwanshi.androidplayground.R

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAJAMA", "Activity_D_Transparent >> onCreate() called")
        enableEdgeToEdge()
        setContentView(R.layout.activity_three)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MAJAMA", "Activity_D_Transparent >> onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MAJAMA", "Activity_D_Transparent >> onRestoreInstanceState() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAJAMA", "Activity_D_Transparent >> onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAJAMA", "Activity_D_Transparent >> onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAJAMA", "Activity_D_Transparent >> onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAJAMA", "Activity_D_Transparent >> onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAJAMA", "Activity_D_Transparent >> onDestroy() called")
    }
}