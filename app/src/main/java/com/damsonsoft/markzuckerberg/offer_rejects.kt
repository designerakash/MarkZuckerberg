package com.damsonsoft.markzuckerberg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class offer_rejects : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer_rejects)



        //actionbar
        val actionbar = supportActionBar
        //set back button
        actionbar?.run {
            //set actionbar title
            actionbar!!.title = "ইয়াহু এর প্রস্তাব প্রত্যাখ্যান"
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
