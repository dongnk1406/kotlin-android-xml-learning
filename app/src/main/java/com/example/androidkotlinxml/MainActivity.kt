package com.example.androidkotlinxml

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkotlinxml.practice.ElectronicStudent
import com.example.androidkotlinxml.practice.InformationStudent
import com.example.androidkotlinxml.practice.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product = Product();
        val product1 = product.enterProductItem("Iphone", 1000.0, 0.1);
        val itStudent = InformationStudent(10.0, 10.0)
        val electronicStudent = ElectronicStudent(5.0, 5.0)
        product.addProductToList(product1);
        product.printProductItem(product1);

        Log.d(
            "Student",
            itStudent.getScore().toString() + " " + electronicStudent.getScore().toString()
        )

//        val edtUserName = findViewById<TextInputLayout>(R.id.edt_sample1_password);
//        Link to view of btnNewActivity
//        val btnNewActivity = findViewById<Button>(R.id.btnNewActivity)
//
//        btnNewActivity.setOnClickListener() {
//            val intent = Intent(this, MainActivity2::class.java)
//            intent.putExtra("Text_MainActivity2", 2)
//            startActivity(intent)
//        }
    }
}