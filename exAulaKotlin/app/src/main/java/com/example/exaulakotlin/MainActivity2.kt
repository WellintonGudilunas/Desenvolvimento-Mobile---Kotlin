package com.example.exaulakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var butaoGoTo1 = findViewById<Button>(R.id.botaoGoTo1);
        var butaoFechar = findViewById<Button>(R.id.botaoFechar);

        butaoGoTo1.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(i)
        }

        butaoFechar.setOnClickListener{
            moveTaskToBack(true);
            exitProcess(-1);

        }
    }
}