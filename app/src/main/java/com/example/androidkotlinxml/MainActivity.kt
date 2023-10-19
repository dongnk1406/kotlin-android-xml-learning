package com.example.androidkotlinxml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Link to view of btnNewActivity
        val btnNewActivity = findViewById<Button>(R.id.btnNewActivity)

        btnNewActivity.setOnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Text_MainActivity2", 2)
            startActivity(intent)
        }
    }
}