package com.example.my_memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    lateinit var button4: Button
    lateinit var prev4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent=Intent(this,page5::class.java)
            startActivity(intent)
        }

        prev4=findViewById(R.id.pev4)
        prev4.setOnClickListener {
            val intent=Intent(this,page3::class.java)
            startActivity(intent)
        }
    }
}