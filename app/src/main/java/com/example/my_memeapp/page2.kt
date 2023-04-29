package com.example.my_memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    lateinit var button2:Button
    lateinit var prev2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            var intent=Intent(this,page3::class.java)
            startActivity(intent)
        }
        prev2=findViewById(R.id.prev2)
        prev2.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}