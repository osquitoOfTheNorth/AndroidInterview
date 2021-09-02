package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (Util.isConsecutiveNumbers((text_input_layout.editText?.text to emptyArray<Int>()).second)) {

            } else {
                textView.text = "Not a set of consecutive numbers."
            }
        }

        super.onCreate(savedInstanceState)
    }
}