package com.example.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Best_CEO : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best__ceo)


        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Childhood"
        //set back button
        actionbar.run {
            //set actionbar title
            actionbar!!.title = "পৃথিবীর সেরা সিইও"
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
