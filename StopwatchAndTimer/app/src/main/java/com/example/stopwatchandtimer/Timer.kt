package com.example.stopwatchandtimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Timer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        val btnGoToStopWatch = findViewById<Button>(R.id.btnGoToStopWatch);
        btnGoToStopWatch.setOnClickListener{
            val stopWatch = Intent(this@Timer, StopWatch::class.java)
            startActivity(stopWatch)
        }
    }
}