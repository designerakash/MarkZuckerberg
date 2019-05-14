package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Debate_Facebook : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debate__facebook)





        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "ফেসবুক নিয়ে বিতর্কে"
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
