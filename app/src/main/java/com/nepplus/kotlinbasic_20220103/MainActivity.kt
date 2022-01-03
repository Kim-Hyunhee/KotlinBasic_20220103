package com.nepplus.kotlinbasic_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// log button play
        btnLog.setOnClickListener {

//
            Log.d(tag: "main", msg : "log")
        }

    }
}