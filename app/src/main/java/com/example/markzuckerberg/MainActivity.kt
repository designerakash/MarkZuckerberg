package com.example.markzuckerberg

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        
        //click button1
        button1.setOnClickListener {
            val intent = Intent(this, Childhood::class.java)
            // start your next activity
            startActivity(intent)
        }

        
        }
    }




