package com.example.my_memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    lateinit var button3:Button
    lateinit var prev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent (this,page4::class.java)
            startActivity(intent)
        }
        prev3=findViewById(R.id.prev3)
        prev3.setOnClickListener {
            val intent=Intent(this,page2::class.java)
            startActivity(intent)
        }
    }
}