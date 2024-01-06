package com.example.app2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val button: Button = findViewById(R.id.button2)
        val textView6: TextView = findViewById(R.id.textView2)
        val editText: EditText = findViewById(R.id.editText)
        val textView5: TextView = findViewById(R.id.textView3)
        val textView4: TextView = findViewById(R.id.textView4)
        val textView3: TextView = findViewById(R.id.textView5)
        val textView2: TextView = findViewById(R.id.textView6)
        val textView1: TextView = findViewById(R.id.textView7)

        button.setOnClickListener {
            val userInput: String = editText.text.toString()
            textView2.text = userInput
            when (count) {
                0 -> {
                    textView1.text = userInput
                    textView1.visibility = View.VISIBLE
                }
                1 -> {
                    textView2.text = userInput
                    textView2.visibility = View.VISIBLE
                }
                2 -> {
                    textView3.text = userInput
                    textView3.visibility = View.VISIBLE
                }
                3 -> {
                    textView4.text = userInput
                    textView4.visibility = View.VISIBLE
                }
                4 -> {
                    textView5.text = userInput
                    textView5.visibility = View.VISIBLE
                }
                5 -> {
                    textView6.text = userInput
                    textView6.visibility = View.VISIBLE
                }
            }

            count++
            editText.setText("")

        }
    }
}