package com.example.stopwatchandtimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StopWatch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stop_watch)

        val btnGoToTimer = findViewById<Button>(R.id.btnGoToTimer);
        btnGoToTimer.setOnClickListener{
            val timer = Intent(this@StopWatch, Timer::class.java)
            startActivity(timer)
        }
    }


}