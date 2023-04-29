package com.example.my_memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    lateinit var prev5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        prev5=findViewById(R.id.button5)
        prev5.setOnClickListener {
            val intent=Intent(this,page4::class.java)
            startActivity(intent)
        }
    }
}