package com.example.mariam_callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate the Main Activity", Toast.LENGTH_SHORT).show()
        Log.d("MainActivity", "MainActivity onCreate")
        val btngoSecondActivity = findViewById<Button>(R.id.goSecondActivity)
        btngoSecondActivity.setOnClickListener{
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart the Main Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onStart")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume the Main Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause the Main Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop the Main Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"onDestroy the Main Activity", Toast.LENGTH_SHORT).show()

        Log.d("MainActivity", "MainActivity onDestroy")
    }

}