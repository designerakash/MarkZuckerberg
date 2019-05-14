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

        //click button20
        button20.setOnClickListener {
            val intent = Intent(this, Best_CEO::class.java)
            // start your next activity
            startActivity(intent)
        }

        //click button5
        button5.setOnClickListener {
            val intent = Intent(this, Database_hack::class.java)
            // start your next activity
            startActivity(intent)
        }


        //click button5(Debate_Facebook)
        button9.setOnClickListener {
            val intent = Intent(this, Debate_Facebook::class.java)
            // start your next activity
            startActivity(intent)
        }

        //click button5(drop_out)
        button13.setOnClickListener {
            val intent = Intent(this, drop_out::class.java)
            // start your next activity
            startActivity(intent)
        }

         //click button15(Young_billiain)
        button15.setOnClickListener {
            val intent = Intent(this, Young_billiain::class.java)
            // start your next activity
            startActivity(intent)
        }


        //click button18(Young_billiain)
        button18.setOnClickListener {
            val intent = Intent(this, Marriage::class.java)
            // start your next activity
            startActivity(intent)
        }


 //click button11(California)
        button11.setOnClickListener {
            val intent = Intent(this, California::class.java)
            // start your next activity
            startActivity(intent)
        }

//click button03(Rejecting_oftware)
        button3.setOnClickListener {
            val intent = Intent(this, Rejecting_oftware::class.java)
            // start your next activity
            startActivity(intent)
        }

//click button07(FaceMash)
        button7.setOnClickListener {
            val intent = Intent(this, FaceMash::class.java)
            // start your next activity
            startActivity(intent)
        }

//click button10(offer_rejects)
        button10.setOnClickListener {
            val intent = Intent(this, offer_rejects::class.java)
            // start your next activity
            startActivity(intent)
        }

//click button22(New_plan)
        button22.setOnClickListener {
            val intent = Intent(this, New_plan::class.java)
            // start your next activity
            startActivity(intent)
        }

//click button22(salary)
        button21.setOnClickListener {
            val intent = Intent(this, salary::class.java)
            // start your next activity
            startActivity(intent)



 }//click button16(Reputation)
        button16.setOnClickListener {
            val intent = Intent(this, Reputation::class.java)
            // start your next activity
            startActivity(intent)
        }


    }
    }




