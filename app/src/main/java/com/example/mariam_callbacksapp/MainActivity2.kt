package com.example.mariam_callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "onCreate the MainActivity2", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity2", "MainActivity2 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart the MainActivity2", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity2", "MainActivity2 onStart")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume the MainActivity2", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity2", "MainActivity2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause the MainActivity2", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity2", "MainActivity2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop the MainActivity2", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity2", "MainActivity2 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "onDestroy the MainActivity2", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onDestroy")
    }
}
