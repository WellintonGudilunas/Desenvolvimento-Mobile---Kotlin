package com.example.exaulakotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var butaoGoTo2 = findViewById<Button>(R.id.botaoGoTo2);
        var butaoFechar = findViewById<Button>(R.id.botaoFechar);

        butaoGoTo2.setOnClickListener {
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(i)
        }

        butaoFechar.setOnClickListener{
            moveTaskToBack(true);
            exitProcess(-1);
        }
    }
}