package com.damsonsoft.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Young_billiain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_young_billiain)


        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "তরুণ বিলিয়নিয়ার"
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
