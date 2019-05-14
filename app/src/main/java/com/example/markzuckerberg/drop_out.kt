package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class drop_out : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drop_out)




        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "Drop_out"
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


