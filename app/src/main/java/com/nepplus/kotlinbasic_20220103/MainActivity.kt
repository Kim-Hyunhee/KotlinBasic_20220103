package com.nepplus.kotlinbasic_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// log button play
        btnLog.setOnClickListener {

//
            Log.d("main","log")
            Log.e("main","log e")

        }
    // toast button
        btnToast.setOnClickListener {
// "hello" sentence
            Toast.makeText(this, "hello~", Toast.LENGTH_SHORT).show()

        }

    }
}