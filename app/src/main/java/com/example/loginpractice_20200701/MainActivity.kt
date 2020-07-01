package com.example.loginpractice_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtu.setOnClickListener {

            //입력된
            val inputId = loginEam.text.toString()
            val inputpw = pwd.text.toString()

            if (inputId == "admin@test.com" && inputpw == "pwer1234") {
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인 실패.", Toast.LENGTH_SHORT).show()
            }
        }


    }
}