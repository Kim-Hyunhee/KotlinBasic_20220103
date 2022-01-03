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

// 로그 버튼 띄우기
        btnLog.setOnClickListener {

//
            Log.d("main","로그")
            Log.e("main","로그 e")

        }
    // 토스트 버튼 누르기
        btnToast.setOnClickListener {
// 토스트로 "안녕하세요." 문장 띄우기
            Toast.makeText(this, "안녕하세요.", Toast.LENGTH_SHORT).show()

        }
        
        btnMessageToast.setOnClickListener {

            // 1. edtMessage에 입력된 문구를 받아서 => 변수에 저장해두자
            val inputMessage = edtMessage.text.toString()   // 입력된 문구(text)를 변수에 저장하자

            // 2. inputMessage변수에 담긴 값을 String에 끼워넣기
            // Python : f'str 사용방법

            Toast.makeText(this, "${inputMessage} 입력됨", Toast.LENGTH_SHORT).show()
        }

        btnMessageTextView.setOnClickListener {

            // 1. 입력된 문구를 받아서 저장 Python : input()
            val inputMessage = edtMessage.text.toString()

            // 2. txtMessage의 문구로 inputMessage 반영
            txtMessage.text = "${inputMessage} 입력 되었다."
        }

    }
}