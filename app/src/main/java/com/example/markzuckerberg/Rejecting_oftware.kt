package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Rejecting_oftware : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rejecting_oftware)


        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "সফটওয়্যার বিক্রির প্রস্তাব প্রত্যাখ্যান"
            //set back button
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true



    }
}
