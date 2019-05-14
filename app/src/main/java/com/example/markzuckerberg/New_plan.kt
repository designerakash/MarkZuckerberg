package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class New_plan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_plan)



        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "নতুন পরিকল্পনা"
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
