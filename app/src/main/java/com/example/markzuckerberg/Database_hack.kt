package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Database_hack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database_hack)





        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "হার্ভার্ড কলেজের ডাটাবেজ হ্যাক"
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
