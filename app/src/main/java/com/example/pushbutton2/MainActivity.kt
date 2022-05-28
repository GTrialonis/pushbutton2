package com.example.pushbutton2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        var clicked = 0

        button.setOnClickListener{
            clicked += 1
            if(clicked > 5) clicked = 1
            when(clicked) {
                1 -> button.setBackgroundColor(Color.RED)
                2 -> button.setBackgroundColor(Color.GREEN)
                3 -> button.setBackgroundColor(Color.BLUE)
                4 -> button.setBackgroundColor(Color.GRAY)
                5 -> button.setBackgroundColor(Color.parseColor("#34ebe8"))
            }

        }
    }
}













