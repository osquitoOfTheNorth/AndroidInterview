package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textLayout = findViewById<TextInputLayout>(R.id.text_input_layout)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            val text = textLayout.editText?.text.toString()
            if (Util.isConsecutiveNumbers(arrayOf(1,2,3))) {

            } else {
                textView.text = "Not a set of consecutive numbers."
            }
        }

        super.onCreate(savedInstanceState)
    }
}