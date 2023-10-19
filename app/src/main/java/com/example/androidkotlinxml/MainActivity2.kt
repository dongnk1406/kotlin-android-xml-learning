package com.example.androidkotlinxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtMainActivity2 = findViewById<TextView>(R.id.tv_mainActivity2)
        val intent = intent
        val number = intent.getIntExtra("Text_MainActivity2", 0)
        txtMainActivity2.text = number.toString()
    }
}