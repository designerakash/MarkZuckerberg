package com.example.markzuckerberg

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //3second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@splash, MainActivity::class.java))
            //finish this activity
            finish()
        },3000)


    }



}
