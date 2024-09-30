package com.example.androidkotlinxml

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product = Product();
        val product1 = product.enterProductItem("Iphone", 1000.0, 0.1);
        product.printProductItem(product1);
        Log.d("Product Tax", product.getTaxPrice(product1.price, product1.tax).toString());

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