package com.example.stopwatchandtimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin);
        btnLogin.setOnClickListener{
            val cronometro = Intent(this@MainActivity, StopWatch::class.java)
            startActivity(cronometro)
        }
    }


}